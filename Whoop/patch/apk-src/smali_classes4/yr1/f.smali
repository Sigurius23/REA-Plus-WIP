.class public final Lyr1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyr1/f;",
        "",
        "Lyr1/e;",
        "questionTypeMapper",
        "<init>",
        "(Lyr1/e;)V",
        "Lcs1/c;",
        "viewEvent",
        "Lur1/g;",
        "a",
        "(Lcs1/c;)Lur1/g;",
        "Lyr1/e;",
        "journal_release"
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
.field private final a:Lyr1/e;


# direct methods
.method public constructor <init>(Lyr1/e;)V
    .locals 1

    const-string v0, "questionTypeMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyr1/f;->a:Lyr1/e;

    return-void
.end method


# virtual methods
.method public final a(Lcs1/c;)Lur1/g;
    .locals 11

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcs1/c$j;

    if-eqz v0, :cond_0

    new-instance v1, Lur1/l$d;

    check-cast p1, Lcs1/c$j;

    invoke-virtual {p1}, Lcs1/c$j;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcs1/c$j;->a()J

    move-result-wide v3

    invoke-virtual {p1}, Lcs1/c$j;->g()Z

    move-result v5

    invoke-virtual {p1}, Lcs1/c$j;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcs1/c$j;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcs1/c$j;->e()Z

    move-result v8

    invoke-virtual {p1}, Lcs1/c$j;->e()Z

    move-result v9

    invoke-virtual {p1}, Lcs1/c$j;->b()Lyr1/b;

    move-result-object v10

    invoke-direct/range {v1 .. v10}, Lur1/l$d;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ZZLyr1/b;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcs1/c$p;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyr1/f;->a:Lyr1/e;

    check-cast p1, Lcs1/c$p;

    invoke-virtual {p1}, Lcs1/c$p;->a()Lw71/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyr1/e;->e(Lw71/d;)Ltr1/c;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lur1/i$a;

    invoke-direct {v0, p1}, Lur1/i$a;-><init>(Ltr1/c;)V

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p1, Lcs1/c$l;

    if-eqz v0, :cond_3

    sget-object p1, Lur1/l$e;->a:Lur1/l$e;

    return-object p1

    :cond_3
    instance-of v0, p1, Lcs1/c$a;

    if-eqz v0, :cond_4

    sget-object p1, Lur1/l$a;->a:Lur1/l$a;

    return-object p1

    :cond_4
    instance-of v0, p1, Lcs1/c$n;

    if-eqz v0, :cond_5

    sget-object p1, Lur1/e$c;->a:Lur1/e$c;

    return-object p1

    :cond_5
    instance-of v0, p1, Lcs1/c$e;

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    new-instance p1, Lur1/e$b;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v2, v1}, Lur1/e$b;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_6
    instance-of v0, p1, Lcs1/c$f;

    if-eqz v0, :cond_7

    new-instance p1, Lur1/e$b;

    invoke-direct {p1, v2}, Lur1/e$b;-><init>(Z)V

    return-object p1

    :cond_7
    instance-of v0, p1, Lcs1/c$q;

    if-eqz v0, :cond_8

    new-instance v0, Lur1/i$b;

    check-cast p1, Lcs1/c$q;

    invoke-virtual {p1}, Lcs1/c$q;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lur1/i$b;-><init>(Z)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lcs1/c$b;

    if-eqz v0, :cond_9

    new-instance v0, Lvr1/c$a;

    check-cast p1, Lcs1/c$b;

    invoke-virtual {p1}, Lcs1/c$b;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lvr1/c$a;-><init>(I)V

    return-object v0

    :cond_9
    instance-of v0, p1, Lcs1/c$k;

    if-eqz v0, :cond_a

    new-instance v0, Lvr1/c$c;

    check-cast p1, Lcs1/c$k;

    invoke-virtual {p1}, Lcs1/c$k;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvr1/c$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_a
    sget-object v0, Lcs1/c$g;->a:Lcs1/c$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p1, Lur1/l$b;->a:Lur1/l$b;

    return-object p1

    :cond_b
    instance-of v0, p1, Lcs1/c$c;

    if-eqz v0, :cond_c

    new-instance v0, Lur1/b$a;

    check-cast p1, Lcs1/c$c;

    invoke-virtual {p1}, Lcs1/c$c;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lur1/b$a;-><init>(I)V

    return-object v0

    :cond_c
    instance-of v0, p1, Lcs1/c$o;

    if-eqz v0, :cond_d

    new-instance v0, Lur1/b$b;

    check-cast p1, Lcs1/c$o;

    invoke-virtual {p1}, Lcs1/c$o;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lur1/b$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_d
    instance-of v0, p1, Lcs1/c$r;

    if-eqz v0, :cond_e

    new-instance v0, Lur1/b$c;

    check-cast p1, Lcs1/c$r;

    invoke-virtual {p1}, Lcs1/c$r;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lur1/b$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_e
    instance-of v0, p1, Lcs1/c$m;

    if-eqz v0, :cond_f

    new-instance v0, Lur1/l$f;

    check-cast p1, Lcs1/c$m;

    invoke-virtual {p1}, Lcs1/c$m;->b()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lur1/l$f;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_f
    instance-of v0, p1, Lcs1/c$i;

    if-eqz v0, :cond_10

    new-instance v0, Lwr1/b$a;

    check-cast p1, Lcs1/c$i;

    invoke-virtual {p1}, Lcs1/c$i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcs1/c$i;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lwr1/b$a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_10
    instance-of v0, p1, Lcs1/c$s;

    if-eqz v0, :cond_11

    new-instance v0, Lwr1/b$b;

    check-cast p1, Lcs1/c$s;

    invoke-virtual {p1}, Lcs1/c$s;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcs1/c$s;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcs1/c$s;->b()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lwr1/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :cond_11
    instance-of v0, p1, Lcs1/c$h;

    if-eqz v0, :cond_12

    new-instance v0, Lur1/l$c;

    check-cast p1, Lcs1/c$h;

    invoke-virtual {p1}, Lcs1/c$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lur1/l$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_12
    instance-of p1, p1, Lcs1/c$d;

    if-eqz p1, :cond_13

    sget-object p1, Lur1/e$a;->a:Lur1/e$a;

    return-object p1

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
