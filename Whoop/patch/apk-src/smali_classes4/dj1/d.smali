.class public final Ldj1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldj1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Ldj1/d;",
        "",
        "<init>",
        "()V",
        "Lri1/n;",
        "domainState",
        "Lcj1/l;",
        "c",
        "(Lri1/n;)Lcj1/l;",
        "Lm91/u;",
        "item",
        "",
        "a",
        "(Lm91/u;)Z",
        "b",
        "health_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ldj1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldj1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldj1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldj1/d;->a:Ldj1/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr21/c;

    if-eqz v0, :cond_0

    check-cast p1, Lr21/c;

    invoke-virtual {p1}, Lr21/c;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lm91/u;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lc41/p2;

    if-eqz v0, :cond_0

    check-cast p1, Lc41/p2;

    invoke-virtual {p1}, Lc41/p2;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CALIBRATING_INFO_CALLOUT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lri1/n;)Lcj1/l;
    .locals 11

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lri1/n;->d()Lri1/m;

    move-result-object v0

    sget-object v1, Lri1/m$a;->a:Lri1/m$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcj1/l$a;->a:Lcj1/l$a;

    return-object p1

    :cond_0
    sget-object v1, Lri1/m$b;->a:Lri1/m$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lri1/n;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lri1/n;->e()Lcj1/m;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcj1/m;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lm91/u;

    invoke-virtual {p0, v3}, Ldj1/d;->a(Lm91/u;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3}, Ldj1/d;->b(Lm91/u;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lri1/n;->e()Lcj1/m;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcj1/m;->g()Ljava/util/List;

    move-result-object v1

    :cond_3
    if-nez v1, :cond_4

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_4
    move-object v4, v1

    invoke-virtual {p1}, Lri1/n;->e()Lcj1/m;

    move-result-object v2

    if-eqz v2, :cond_6

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcj1/m;->b(Lcj1/m;ZLjava/util/List;ZLcom/whoop/health/domain/models/HealthspanHeroMetricStyle;Lcom/whoop/navigation/e;ZILjava/lang/Object;)Lcj1/m;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Lcj1/l$b;

    invoke-direct {v0, p1}, Lcj1/l$b;-><init>(Lcj1/m;)V

    return-object v0

    :cond_6
    :goto_1
    sget-object p1, Lcj1/l$a;->a:Lcj1/l$a;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
