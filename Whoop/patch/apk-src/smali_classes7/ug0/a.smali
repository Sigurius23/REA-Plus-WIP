.class public final Lug0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lug0/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lzg0/g;",
        "event",
        "Ltg0/a;",
        "a",
        "(Lzg0/g;)Ltg0/a;",
        "Lzr2/a;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug0/a;->a:Lzr2/a;

    return-void
.end method


# virtual methods
.method public final a(Lzg0/g;)Ltg0/a;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lzg0/g$w;

    if-eqz v2, :cond_0

    new-instance v2, Ltg0/a$u;

    check-cast v1, Lzg0/g$w;

    invoke-virtual {v1}, Lzg0/g$w;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$w;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ltg0/a$u;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2

    :cond_0
    instance-of v2, v1, Lzg0/g$m;

    if-eqz v2, :cond_1

    new-instance v2, Ltg0/a$k;

    check-cast v1, Lzg0/g$m;

    invoke-virtual {v1}, Lzg0/g$m;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$m;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ltg0/a$k;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    return-object v2

    :cond_1
    instance-of v2, v1, Lzg0/g$l;

    if-eqz v2, :cond_2

    new-instance v2, Ltg0/a$j;

    check-cast v1, Lzg0/g$l;

    invoke-virtual {v1}, Lzg0/g$l;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$l;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ltg0/a$j;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    return-object v2

    :cond_2
    instance-of v2, v1, Lzg0/g$v;

    if-eqz v2, :cond_3

    new-instance v2, Ltg0/a$t;

    check-cast v1, Lzg0/g$v;

    invoke-virtual {v1}, Lzg0/g$v;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$v;->a()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lzg0/g$v;->b()Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Ltg0/a$t;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2

    :cond_3
    instance-of v2, v1, Lzg0/g$h;

    if-eqz v2, :cond_4

    new-instance v2, Ltg0/a$f;

    check-cast v1, Lzg0/g$h;

    invoke-virtual {v1}, Lzg0/g$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ltg0/a$f;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_4
    instance-of v2, v1, Lzg0/g$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    check-cast v1, Lzg0/g$b;

    invoke-virtual {v1}, Lzg0/g$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lzg0/g$b;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lzg0/g$b;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lzg0/g$b;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lzg0/g$b;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lzg0/g$b;->a()Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v1}, Lzg0/g$b;->k()Z

    move-result v11

    invoke-virtual {v1}, Lzg0/g$b;->e()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_5

    new-instance v12, Ltg0/a$d;

    sget-object v14, Lnl0/b;->USER:Lnl0/b;

    iget-object v2, v0, Lug0/a;->a:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->b()J

    move-result-wide v16

    const/16 v19, 0x14

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Ltg0/a$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_5
    move-object v12, v3

    :goto_0
    invoke-virtual {v1}, Lzg0/g$b;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lzg0/g$b;->j()Z

    move-result v14

    invoke-virtual {v1}, Lzg0/g$b;->i()Z

    move-result v15

    new-instance v4, Ltg0/a$b;

    invoke-direct/range {v4 .. v15}, Ltg0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLtg0/a$d;Ljava/lang/String;ZZ)V

    return-object v4

    :cond_6
    instance-of v2, v1, Lzg0/g$q;

    if-eqz v2, :cond_7

    sget-object v1, Ltg0/a$n;->a:Ltg0/a$n;

    return-object v1

    :cond_7
    instance-of v2, v1, Lzg0/g$d;

    if-eqz v2, :cond_8

    new-instance v4, Ltg0/a$d;

    check-cast v1, Lzg0/g$d;

    invoke-virtual {v1}, Lzg0/g$d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lzg0/g$d;->c()Lnl0/b;

    move-result-object v6

    invoke-virtual {v1}, Lzg0/g$d;->b()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lzg0/g$d;->d()J

    move-result-wide v8

    invoke-virtual {v1}, Lzg0/g$d;->e()Z

    move-result v10

    invoke-direct/range {v4 .. v10}, Ltg0/a$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;JZ)V

    return-object v4

    :cond_8
    instance-of v2, v1, Lzg0/g$r;

    if-eqz v2, :cond_9

    sget-object v1, Ltg0/a$o;->a:Ltg0/a$o;

    return-object v1

    :cond_9
    instance-of v2, v1, Lzg0/g$s;

    if-eqz v2, :cond_a

    new-instance v2, Ltg0/a$p;

    check-cast v1, Lzg0/g$s;

    invoke-virtual {v1}, Lzg0/g$s;->b()Lcom/whoop/ai/chat/models/TurnFeedback;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$s;->a()Z

    move-result v1

    invoke-direct {v2, v3, v1}, Ltg0/a$p;-><init>(Lcom/whoop/ai/chat/models/TurnFeedback;Z)V

    return-object v2

    :cond_a
    instance-of v2, v1, Lzg0/g$a;

    if-eqz v2, :cond_b

    new-instance v2, Ltg0/a$a;

    check-cast v1, Lzg0/g$a;

    invoke-virtual {v1}, Lzg0/g$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$a;->b()Z

    move-result v4

    invoke-virtual {v1}, Lzg0/g$a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lzg0/g$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Ltg0/a$a;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_b
    instance-of v2, v1, Lzg0/g$o;

    if-eqz v2, :cond_c

    new-instance v4, Ltg0/a$d;

    check-cast v1, Lzg0/g$o;

    invoke-virtual {v1}, Lzg0/g$o;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lnl0/b;->USER:Lnl0/b;

    iget-object v1, v0, Lug0/a;->a:Lzr2/a;

    invoke-interface {v1}, Lzr2/a;->b()J

    move-result-wide v8

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v12}, Ltg0/a$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_c
    instance-of v2, v1, Lzg0/g$c;

    if-eqz v2, :cond_d

    new-instance v2, Ltg0/a$c;

    check-cast v1, Lzg0/g$c;

    invoke-virtual {v1}, Lzg0/g$c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ltg0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_d
    instance-of v2, v1, Lzg0/g$n;

    if-eqz v2, :cond_e

    sget-object v1, Ltg0/a$l;->a:Ltg0/a$l;

    return-object v1

    :cond_e
    instance-of v2, v1, Lzg0/g$f;

    if-eqz v2, :cond_f

    sget-object v1, Ltg0/a$e;->a:Ltg0/a$e;

    return-object v1

    :cond_f
    instance-of v2, v1, Lzg0/g$t;

    if-eqz v2, :cond_10

    new-instance v2, Ltg0/a$r;

    check-cast v1, Lzg0/g$t;

    invoke-virtual {v1}, Lzg0/g$t;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ltg0/a$r;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_10
    instance-of v2, v1, Lzg0/g$u;

    if-eqz v2, :cond_11

    new-instance v2, Ltg0/a$s;

    check-cast v1, Lzg0/g$u;

    invoke-virtual {v1}, Lzg0/g$u;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$u;->b()Z

    move-result v1

    invoke-direct {v2, v3, v1}, Ltg0/a$s;-><init>(Ljava/lang/String;Z)V

    return-object v2

    :cond_11
    instance-of v2, v1, Lzg0/g$j;

    if-eqz v2, :cond_12

    new-instance v2, Ltg0/a$h;

    check-cast v1, Lzg0/g$j;

    invoke-virtual {v1}, Lzg0/g$j;->a()Z

    move-result v1

    invoke-direct {v2, v1}, Ltg0/a$h;-><init>(Z)V

    return-object v2

    :cond_12
    instance-of v2, v1, Lzg0/g$i;

    if-eqz v2, :cond_13

    new-instance v2, Ltg0/a$g;

    check-cast v1, Lzg0/g$i;

    invoke-virtual {v1}, Lzg0/g$i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lzg0/g$i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ltg0/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_13
    sget-object v2, Lzg0/g$k;->a:Lzg0/g$k;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    sget-object v1, Ltg0/a$i;->a:Ltg0/a$i;

    return-object v1

    :cond_14
    instance-of v2, v1, Lzg0/g$p;

    if-eqz v2, :cond_15

    new-instance v2, Ltg0/a$m;

    check-cast v1, Lzg0/g$p;

    invoke-virtual {v1}, Lzg0/g$p;->a()Lc91/b;

    move-result-object v1

    invoke-direct {v2, v1}, Ltg0/a$m;-><init>(Lc91/b;)V

    return-object v2

    :cond_15
    instance-of v2, v1, Lzg0/g$e;

    if-nez v2, :cond_17

    sget-object v2, Lzg0/g$g;->a:Lzg0/g$g;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v3

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_17
    return-object v3
.end method
