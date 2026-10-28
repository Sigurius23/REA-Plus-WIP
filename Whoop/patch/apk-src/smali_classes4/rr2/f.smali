.class public final Lrr2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrr2/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lrr2/f;",
        "Lrr2/i;",
        "Ljs0/c;",
        "config",
        "<init>",
        "(Ljs0/c;)V",
        "Lio/sentry/y3;",
        "context",
        "",
        "a",
        "(Lio/sentry/y3;)D",
        "Ljs0/c;",
        "app_prodStandardRelease"
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
.field private final a:Ljs0/c;


# direct methods
.method public constructor <init>(Ljs0/c;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr2/f;->a:Ljs0/c;

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/y3;)D
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrr2/f;->a:Ljs0/c;

    sget-object v0, Lcom/whoop/data/repositories/SentrySampleRate;->INSTANCE:Lcom/whoop/data/repositories/SentrySampleRate;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v0}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/Double;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_0

    :cond_0
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    goto :goto_0

    :cond_1
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    goto :goto_0

    :cond_2
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    goto :goto_0

    :cond_3
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_0

    :cond_4
    const-class v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :cond_5
    move-object v5, v0

    :cond_6
    :goto_0
    if-nez v5, :cond_7

    goto :goto_1

    :cond_7
    move-object v0, v5

    :goto_1
    if-eqz v0, :cond_8

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Double"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
