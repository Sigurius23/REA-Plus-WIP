.class public final Lpm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lpm1/d;",
        "",
        "<init>",
        "()V",
        "Lom1/k;",
        "Lqm1/b;",
        "b",
        "(Lom1/k;)Lqm1/b;",
        "domainState",
        "a",
        "home_release"
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

.method private final b(Lom1/k;)Lqm1/b;
    .locals 6

    new-instance v0, Lqm1/b;

    invoke-virtual {p1}, Lom1/k;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lom1/k;->d()Lom1/a;

    move-result-object v2

    invoke-virtual {p1}, Lom1/k;->e()Lom1/b;

    move-result-object v3

    invoke-virtual {p1}, Lom1/k;->g()Z

    move-result v4

    invoke-virtual {p1}, Lom1/k;->f()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lqm1/b;-><init>(Ljava/util/List;Lom1/a;Lom1/b;ZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lom1/k;)Lqm1/b;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpm1/d;->b(Lom1/k;)Lqm1/b;

    move-result-object p1

    return-object p1
.end method
