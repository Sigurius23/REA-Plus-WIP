.class public final Lw71/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lw71/i0;",
        "",
        "<init>",
        "()V",
        "callback",
        "Lw71/k0;",
        "stateWrite",
        "a",
        "(Ljava/lang/Object;Lw71/k0;)Ljava/lang/Object;",
        "design_release"
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
.field public static final a:Lw71/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw71/i0;

    invoke-direct {v0}, Lw71/i0;-><init>()V

    sput-object v0, Lw71/i0;->a:Lw71/i0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lw71/k0;)Ljava/lang/Object;
    .locals 6

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    goto/16 :goto_4

    :cond_0
    instance-of v0, p1, Lw71/d$e;

    if-eqz v0, :cond_1

    check-cast p1, Lw71/d$e;

    invoke-virtual {p1}, Lw71/d$e;->b()Z

    move-result p1

    invoke-static {p2, p1}, Lw71/j0;->a(Lw71/k0;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lw71/d$k;

    if-eqz v0, :cond_2

    check-cast p1, Lw71/d$k;

    invoke-virtual {p1}, Lw71/d$k;->a()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p2, p1}, Lw71/j0;->a(Lw71/k0;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lw71/d$j;

    if-eqz v0, :cond_3

    check-cast p1, Lw71/d$j;

    invoke-virtual {p1}, Lw71/d$j;->a()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p2, p1}, Lw71/j0;->a(Lw71/k0;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lw71/d$a;

    if-eqz v0, :cond_5

    check-cast p1, Lw71/d$a;

    invoke-virtual {p1}, Lw71/d$a;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lw71/k0;->e()Ljava/lang/Double;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lw71/j0;->g(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p1

    return-object p1

    :cond_5
    move-object v0, p2

    instance-of p2, p1, Lw71/d$c;

    if-eqz p2, :cond_7

    check-cast p1, Lw71/d$c;

    invoke-virtual {p1}, Lw71/d$c;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_2
    move-object v2, p1

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lw71/k0;->e()Ljava/lang/Double;

    move-result-object p1

    goto :goto_2

    :goto_3
    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lw71/j0;->g(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p2, p1, Lw71/d$i;

    if-eqz p2, :cond_9

    check-cast p1, Lw71/d$i;

    invoke-virtual {p1}, Lw71/d$i;->b()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_8

    invoke-virtual {v0}, Lw71/k0;->h()Ljava/lang/Long;

    move-result-object p1

    :cond_8
    move-object v3, p1

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lw71/j0;->g(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p1

    :cond_9
    :goto_4
    return-object p1
.end method
