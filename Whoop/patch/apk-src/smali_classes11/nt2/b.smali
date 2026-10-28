.class public abstract Lnt2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lnt2/a;",
        "",
        "planName",
        "Ljt2/l;",
        "a",
        "(Lnt2/a;Ljava/lang/String;)Ljt2/l;",
        "weekly-plan_release"
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
.method public static final a(Lnt2/a;Ljava/lang/String;)Ljt2/l;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lnt2/a$d;

    if-eqz v0, :cond_0

    new-instance p0, Ljt2/l$d;

    invoke-direct {p0, p1}, Ljt2/l$d;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_0
    instance-of v0, p0, Lnt2/a$g;

    if-eqz v0, :cond_1

    new-instance v1, Ljt2/l$g;

    check-cast p0, Lnt2/a$g;

    invoke-virtual {p0}, Lnt2/a$g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lnt2/a$g;->i()Z

    move-result v4

    invoke-virtual {p0}, Lnt2/a$g;->c()Z

    move-result v5

    invoke-virtual {p0}, Lnt2/a$g;->f()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lnt2/a$g;->b()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lnt2/a$g;->a()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lnt2/a$g;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Lnt2/a$g;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Lnt2/a$g;->h()Ljava/lang/String;

    move-result-object v11

    move-object v3, p1

    invoke-direct/range {v1 .. v11}, Ljt2/l$g;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    instance-of p1, p0, Lnt2/a$f;

    if-eqz p1, :cond_2

    new-instance p1, Ljt2/l$f;

    check-cast p0, Lnt2/a$f;

    invoke-virtual {p0}, Lnt2/a$f;->a()Z

    move-result p0

    invoke-direct {p1, p0}, Ljt2/l$f;-><init>(Z)V

    return-object p1

    :cond_2
    instance-of p1, p0, Lnt2/a$e;

    if-eqz p1, :cond_3

    new-instance p1, Ljt2/l$e;

    check-cast p0, Lnt2/a$e;

    invoke-virtual {p0}, Lnt2/a$e;->a()Ljt2/c;

    move-result-object p0

    invoke-direct {p1, p0}, Ljt2/l$e;-><init>(Ljt2/c;)V

    return-object p1

    :cond_3
    instance-of p1, p0, Lnt2/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Ljt2/l$c;

    check-cast p0, Lnt2/a$c;

    invoke-virtual {p0}, Lnt2/a$c;->a()Ljt2/c;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$c;->b()I

    move-result p0

    invoke-direct {p1, v0, p0}, Ljt2/l$c;-><init>(Ljt2/c;I)V

    return-object p1

    :cond_4
    instance-of p1, p0, Lnt2/a$j;

    if-eqz p1, :cond_5

    new-instance p1, Ljt2/l$j;

    check-cast p0, Lnt2/a$j;

    invoke-virtual {p0}, Lnt2/a$j;->a()Ljt2/c;

    move-result-object p0

    invoke-direct {p1, p0}, Ljt2/l$j;-><init>(Ljt2/c;)V

    return-object p1

    :cond_5
    instance-of p1, p0, Lnt2/a$n;

    if-eqz p1, :cond_6

    new-instance p1, Ljt2/l$n;

    check-cast p0, Lnt2/a$n;

    invoke-virtual {p0}, Lnt2/a$n;->a()Ljt2/c;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$n;->b()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ljt2/l$n;-><init>(Ljt2/c;Ljava/lang/String;)V

    return-object p1

    :cond_6
    instance-of p1, p0, Lnt2/a$r;

    if-eqz p1, :cond_7

    new-instance p1, Ljt2/l$r;

    check-cast p0, Lnt2/a$r;

    invoke-virtual {p0}, Lnt2/a$r;->a()Ljt2/c;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$r;->b()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ljt2/l$r;-><init>(Ljt2/c;Ljava/lang/String;)V

    return-object p1

    :cond_7
    instance-of p1, p0, Lnt2/a$o;

    if-eqz p1, :cond_8

    new-instance p1, Ljt2/l$o;

    check-cast p0, Lnt2/a$o;

    invoke-virtual {p0}, Lnt2/a$o;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$o;->c()Z

    move-result v1

    invoke-virtual {p0}, Lnt2/a$o;->b()I

    move-result p0

    invoke-direct {p1, v0, v1, p0}, Ljt2/l$o;-><init>(Ljava/lang/String;ZI)V

    return-object p1

    :cond_8
    instance-of p1, p0, Lnt2/a$p;

    if-eqz p1, :cond_9

    new-instance p1, Ljt2/l$p;

    check-cast p0, Lnt2/a$p;

    invoke-virtual {p0}, Lnt2/a$p;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$p;->d()Z

    move-result v1

    invoke-virtual {p0}, Lnt2/a$p;->c()Z

    move-result v2

    invoke-virtual {p0}, Lnt2/a$p;->b()I

    move-result p0

    invoke-direct {p1, v0, v1, v2, p0}, Ljt2/l$p;-><init>(Ljava/lang/String;ZZI)V

    return-object p1

    :cond_9
    instance-of p1, p0, Lnt2/a$a;

    if-eqz p1, :cond_a

    new-instance p1, Ljt2/l$a;

    check-cast p0, Lnt2/a$a;

    invoke-virtual {p0}, Lnt2/a$a;->a()I

    move-result p0

    invoke-direct {p1, p0}, Ljt2/l$a;-><init>(I)V

    return-object p1

    :cond_a
    sget-object p1, Lnt2/a$k;->a:Lnt2/a$k;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p0, Ljt2/l$k;->a:Ljt2/l$k;

    return-object p0

    :cond_b
    instance-of p1, p0, Lnt2/a$m;

    if-eqz p1, :cond_c

    new-instance p1, Ljt2/l$m;

    check-cast p0, Lnt2/a$m;

    invoke-virtual {p0}, Lnt2/a$m;->a()I

    move-result p0

    invoke-direct {p1, p0}, Ljt2/l$m;-><init>(I)V

    return-object p1

    :cond_c
    sget-object p1, Lnt2/a$h;->a:Lnt2/a$h;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    sget-object p0, Ljt2/l$h;->a:Ljt2/l$h;

    return-object p0

    :cond_d
    sget-object p1, Lnt2/a$i;->a:Lnt2/a$i;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    sget-object p0, Ljt2/l$i;->a:Ljt2/l$i;

    return-object p0

    :cond_e
    instance-of p1, p0, Lnt2/a$q;

    if-eqz p1, :cond_f

    new-instance p1, Ljt2/l$q;

    check-cast p0, Lnt2/a$q;

    invoke-virtual {p0}, Lnt2/a$q;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p0

    invoke-direct {p1, p0}, Ljt2/l$q;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    return-object p1

    :cond_f
    instance-of p1, p0, Lnt2/a$s;

    if-eqz p1, :cond_10

    new-instance p1, Ljt2/l$s;

    check-cast p0, Lnt2/a$s;

    invoke-virtual {p0}, Lnt2/a$s;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v0

    invoke-virtual {p0}, Lnt2/a$s;->b()D

    move-result-wide v1

    invoke-direct {p1, v0, v1, v2}, Ljt2/l$s;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V

    return-object p1

    :cond_10
    instance-of p1, p0, Lnt2/a$l;

    if-eqz p1, :cond_11

    new-instance p1, Ljt2/l$l;

    check-cast p0, Lnt2/a$l;

    invoke-virtual {p0}, Lnt2/a$l;->a()D

    move-result-wide v0

    invoke-virtual {p0}, Lnt2/a$l;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p0

    invoke-direct {p1, v0, v1, p0}, Ljt2/l$l;-><init>(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    return-object p1

    :cond_11
    instance-of p1, p0, Lnt2/a$b;

    if-eqz p1, :cond_12

    new-instance p1, Ljt2/l$b;

    check-cast p0, Lnt2/a$b;

    invoke-virtual {p0}, Lnt2/a$b;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljt2/l$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_12
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
