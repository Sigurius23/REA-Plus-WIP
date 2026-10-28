.class public abstract Lze/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhg/i;

.field public static final b:Lhg/i;

.field public static final c:Lhg/i;

.field public static final d:Lhg/i;

.field public static final e:Lhg/i;

.field public static final f:Lhg/j;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->e:Lhg/l;

    new-instance v2, Ljg/e;

    const-string v3, "code"

    invoke-direct {v2, v3}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v4, v3, [Lhg/d;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    sput-object v0, Lze/a;->a:Lhg/i;

    new-instance v2, Lhg/i;

    new-instance v4, Ljg/e;

    const-string v6, "__type"

    invoke-direct {v4, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v3, [Lhg/d;

    aput-object v4, v6, v5

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v1, v4, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    sput-object v2, Lze/a;->b:Lhg/i;

    new-instance v1, Lhg/i;

    sget-object v4, Lhg/l;->i:Lhg/l;

    new-instance v6, Ljg/e;

    const-string v7, "message"

    invoke-direct {v6, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v3, [Lhg/d;

    aput-object v6, v7, v5

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v1, v4, v6, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    sput-object v1, Lze/a;->c:Lhg/i;

    new-instance v6, Lhg/i;

    new-instance v7, Ljg/e;

    const-string v8, "Message"

    invoke-direct {v7, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v3, [Lhg/d;

    aput-object v7, v8, v5

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v6, v4, v7, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    sput-object v6, Lze/a;->d:Lhg/i;

    new-instance v7, Lhg/i;

    new-instance v8, Ljg/e;

    const-string v9, "errorMessage"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v3, v3, [Lhg/d;

    aput-object v8, v3, v5

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v7, v4, v3, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    sput-object v7, Lze/a;->e:Lhg/i;

    new-instance v3, Lxl/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lxl/a;-><init>(I)V

    invoke-virtual {v3, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v1}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v7}, Lxl/a;->p(Lhg/i;)V

    new-instance v0, Lhg/j;

    invoke-direct {v0, v3}, Lhg/j;-><init>(Lxl/a;)V

    sput-object v0, Lze/a;->f:Lhg/j;

    return-void
.end method

.method public static a(Lmf/h;[B)Lye/c;
    .locals 7

    const-string v0, "headers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "x-amzn-error-message"

    invoke-interface {p0, v0}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ":error-message"

    invoke-interface {p0, v0}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    const-string v1, "X-Amzn-Errortype"

    invoke-interface {p0, v1}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p1, :cond_a

    new-instance v2, Ljg/b;

    invoke-direct {v2, p1}, Ljg/b;-><init>([B)V

    sget-object p1, Lze/a;->f:Lhg/j;

    invoke-virtual {v2, p1}, Ljg/b;->d(Lhg/j;)Lhg/c;

    move-result-object p1

    move-object v2, v1

    move-object v3, v2

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lze/a;->a:Lhg/i;

    iget v5, v5, Lhg/i;->b:I

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_2

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v5, Lze/a;->b:Lhg/i;

    iget v5, v5, Lhg/i;->b:I

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_4

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_4
    :goto_2
    sget-object v5, Lze/a;->c:Lhg/i;

    iget v5, v5, Lhg/i;->b:I

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v6, v5, :cond_9

    :goto_3
    sget-object v5, Lze/a;->d:Lhg/i;

    iget v5, v5, Lhg/i;->b:I

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v6, v5, :cond_9

    :goto_4
    sget-object v5, Lze/a;->e:Lhg/i;

    iget v5, v5, Lhg/i;->b:I

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    if-eqz v4, :cond_b

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_9
    :goto_6
    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_a
    move-object v2, v1

    move-object v3, v2

    :cond_b
    new-instance p1, Lye/c;

    if-nez p0, :cond_d

    if-nez v2, :cond_c

    move-object p0, v3

    goto :goto_7

    :cond_c
    move-object p0, v2

    :cond_d
    :goto_7
    if-eqz p0, :cond_e

    const-string v2, "#"

    invoke-static {p0, v2, p0}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v2, ":"

    invoke-static {p0, v2}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_8

    :cond_e
    move-object p0, v1

    :goto_8
    invoke-direct {p1, p0, v0, v1}, Lye/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method
