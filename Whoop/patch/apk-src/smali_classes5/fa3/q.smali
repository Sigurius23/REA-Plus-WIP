.class public final Lfa3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya3/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b(Lr93/b;Lr93/b;Lr93/e;)I
    .locals 6

    const-string v0, "superDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr93/c;

    const/4 v1, 0x2

    if-eqz v0, :cond_7

    instance-of v0, p2, Lr93/w;

    if-eqz v0, :cond_7

    invoke-static {p2}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    sget v0, Lfa3/e;->l:I

    move-object v0, p2

    check-cast v0, Lr93/w;

    move-object v2, v0

    check-cast v2, Lu93/n;

    invoke-virtual {v2}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lfa3/e;->b(Lva3/h;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lfa3/g0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Lu93/n;->getName()Lva3/h;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lfa3/g0;->j:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    move-object v2, p1

    check-cast v2, Lr93/c;

    invoke-static {v2}, Lse/g;->B(Lr93/c;)Lr93/c;

    move-result-object v2

    instance-of v3, p1, Lr93/w;

    if-eqz v3, :cond_2

    move-object v4, p1

    check-cast v4, Lr93/w;

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_3

    invoke-interface {v0}, Lr93/w;->f0()Z

    move-result v5

    invoke-interface {v4}, Lr93/w;->f0()Z

    move-result v4

    if-ne v5, v4, :cond_3

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_8

    invoke-interface {v0}, Lr93/w;->f0()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    instance-of v4, p3, Lha3/c;

    if-eqz v4, :cond_7

    invoke-interface {v0}, Lr93/w;->Z()Lr93/w;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    invoke-static {p3, v2}, Lse/g;->D(Lr93/e;Lr93/c;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_2

    :cond_6
    instance-of p3, v2, Lr93/w;

    if-eqz p3, :cond_8

    if-eqz v3, :cond_8

    check-cast v2, Lr93/w;

    invoke-static {v2}, Lfa3/e;->a(Lr93/w;)Lr93/w;

    move-result-object p3

    if-eqz p3, :cond_8

    invoke-static {v0, v1}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object p3

    move-object v0, p1

    check-cast v0, Lr93/w;

    invoke-interface {v0}, Lr93/w;->a()Lr93/w;

    move-result-object v0

    const-string v2, "getOriginal(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    :cond_7
    :goto_2
    invoke-static {p1, p2}, Ljc/x;->D(Lr93/b;Lr93/b;)Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    :goto_3
    return v1

    :cond_9
    const/4 p1, 0x3

    return p1
.end method
