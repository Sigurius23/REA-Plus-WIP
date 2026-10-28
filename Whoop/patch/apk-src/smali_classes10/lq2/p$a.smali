.class public abstract Llq2/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llq2/p$a$a;,
        Llq2/p$a$b;,
        Llq2/p$a$c;,
        Llq2/p$a$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\t\n\u0007\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llq2/p$a;",
        "",
        "<init>",
        "()V",
        "Lkr2/d;",
        "type",
        "Li2/t;",
        "a",
        "(Lkr2/d;)Li2/t;",
        "d",
        "c",
        "b",
        "Llq2/p$a$a;",
        "Llq2/p$a$b;",
        "Llq2/p$a$c;",
        "Llq2/p$a$d;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llq2/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkr2/d;)Li2/t;
    .locals 8

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkr2/d$d;->b:Lkr2/d$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->l()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->k()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lkr2/d$h;->b:Lkr2/d$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->x()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->w()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Lkr2/d$g;->b:Lkr2/d$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->u()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->t()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lkr2/d$c;->b:Lkr2/d$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->i()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->h()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object v0, Lkr2/d$b;->b:Lkr2/d$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->f()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->e()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v0, Lkr2/d$f;->b:Lkr2/d$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->r()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->q()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object v0, Lkr2/d$e;->b:Lkr2/d$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->o()J

    move-result-wide v2

    new-instance p1, Li2/x;

    invoke-direct {p1, v2, v3}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->n()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {p1, v0}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object v0, Lkr2/d$a;->b:Lkr2/d$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->c()J

    move-result-wide v1

    new-instance p1, Li2/x;

    invoke-direct {p1, v1, v2}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->b()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {p1, v3}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-wide/16 v4, 0x0

    const/16 v6, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v6}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object v0, Li2/t;->b:Li2/s;

    invoke-static {}, Lkr2/e;->l()J

    move-result-wide v1

    new-instance p1, Li2/x;

    invoke-direct {p1, v1, v2}, Li2/x;-><init>(J)V

    invoke-static {}, Lkr2/e;->k()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {p1, v3}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-wide/16 v4, 0x0

    const/16 v6, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v6}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    return-object p1
.end method
