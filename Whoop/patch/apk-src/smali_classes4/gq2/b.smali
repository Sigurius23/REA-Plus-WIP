.class public final Lgq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgq2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lgq2/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/user/journey/model/yearinreview/StatStyle;",
        "style",
        "Luq2/a;",
        "a",
        "(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Luq2/a;",
        "Ly81/e;",
        "c",
        "(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Ly81/e;",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;",
        "statistics",
        "Luq2/b;",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Luq2/a;
    .locals 5

    sget-object v0, Lgq2/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    return-object v1

    :pswitch_0
    sget p1, Lyp2/c;->x:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    sget v2, Lyp2/c;->w:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    new-instance v3, Ljr2/d;

    invoke-static {}, Ljr2/a;->c()Li2/t;

    move-result-object v4

    invoke-direct {v3, v1, v4, v0, v1}, Ljr2/d;-><init>(Li2/x;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Luq2/a;

    invoke-direct {v0, p1, v3, v2}, Luq2/a;-><init>(Lcom/whoop/design/util/TextResource;Ljr2/d;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :pswitch_1
    sget p1, Lyp2/c;->z:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    sget v2, Lyp2/c;->y:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    new-instance v3, Ljr2/d;

    invoke-static {}, Ljr2/a;->d()Li2/t;

    move-result-object v4

    invoke-direct {v3, v1, v4, v0, v1}, Ljr2/d;-><init>(Li2/x;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Luq2/a;

    invoke-direct {v0, p1, v3, v2}, Luq2/a;-><init>(Lcom/whoop/design/util/TextResource;Ljr2/d;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final c(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Ly81/e;
    .locals 2

    sget-object v0, Lgq2/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lgq2/b$h;->w:Lgq2/b$h;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lgq2/b$d;->w:Lgq2/b$d;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lgq2/b$c;->w:Lgq2/b$c;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p1, Lgq2/b$b;->w:Lgq2/b$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object p1, Lgq2/b$g;->w:Lgq2/b$g;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object p1, Lgq2/b$f;->w:Lgq2/b$f;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_6
    sget-object p1, Lgq2/b$e;->w:Lgq2/b$e;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_7
    const-wide v0, 0xff0e4a86L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_8
    const-wide v0, 0xff086bb2L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_9
    const-wide v0, 0xff0093e7L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_a
    const-wide v0, 0xff66deffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;",
            ">;)",
            "Ljava/util/List<",
            "Luq2/b;",
            ">;"
        }
    .end annotation

    const-string v0, "statistics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getAverageStat()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getAverageStatStyle()Lcom/whoop/user/journey/model/yearinreview/StatStyle;

    move-result-object v3

    invoke-direct {p0, v3}, Lgq2/b;->c(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Ly81/e;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getStatStyles()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/user/journey/model/yearinreview/StatStyle;

    new-instance v10, Luq2/c;

    invoke-direct {p0, v4}, Lgq2/b;->c(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Ly81/e;

    move-result-object v4

    invoke-direct {v10, v4}, Luq2/c;-><init>(Ly81/e;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;->getAverageStatStyle()Lcom/whoop/user/journey/model/yearinreview/StatStyle;

    move-result-object v2

    invoke-direct {p0, v2}, Lgq2/b;->a(Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Luq2/a;

    move-result-object v10

    new-instance v4, Luq2/b;

    invoke-direct/range {v4 .. v10}, Luq2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/util/List;Luq2/a;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
