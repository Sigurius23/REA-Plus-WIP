.class public final Lp93/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt93/c;


# instance fields
.field public final a:Lkb3/k;

.field public final b:Lr93/b0;


# direct methods
.method public constructor <init>(Lkb3/k;Lu93/e0;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp93/a;->a:Lkb3/k;

    iput-object p2, p0, Lp93/a;->b:Lr93/b0;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final b(Lva3/e;Lva3/h;)Z
    .locals 2

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "asString(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Function"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "KFunction"

    invoke-static {p2, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SuspendFunction"

    invoke-static {p2, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "KSuspendFunction"

    invoke-static {p2, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lp93/m;->b:Lp93/m;

    invoke-static {}, Lds/q;->y()Lp93/m;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lp93/m;->a(Ljava/lang/String;Lva3/e;)Lp93/l;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final c(Lva3/c;)Lr93/e;
    .locals 5

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lva3/c;->c:Z

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lva3/c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p1, Lva3/c;->b:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    const-string v1, "Function"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object p1, p1, Lva3/c;->a:Lva3/e;

    sget-object v1, Lp93/m;->b:Lp93/m;

    invoke-static {}, Lds/q;->y()Lp93/m;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lp93/m;->a(Ljava/lang/String;Lva3/e;)Lp93/l;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lp93/l;->a()Lp93/k;

    move-result-object v1

    invoke-virtual {v0}, Lp93/l;->b()I

    move-result v0

    iget-object v3, p0, Lp93/a;->b:Lr93/b0;

    invoke-interface {v3, p1}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object p1

    check-cast p1, Lu93/a0;

    iget-object p1, p1, Lu93/a0;->F:Lkb3/i;

    sget-object v3, Lu93/a0;->I:[Lj93/z;

    aget-object v2, v3, v2

    invoke-static {p1, v2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lib3/c;

    if-eqz v4, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lib3/c;

    new-instance v2, Lp93/c;

    iget-object v3, p0, Lp93/a;->a:Lkb3/k;

    invoke-direct {v2, v3, p1, v1, v0}, Lp93/c;-><init>(Lkb3/k;Lib3/c;Lp93/k;I)V

    return-object v2

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method
