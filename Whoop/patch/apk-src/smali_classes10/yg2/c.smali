.class public final Lyg2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyg2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lyg2/c;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/hrZones/network/ZoneID;",
        "zoneID",
        "Ln71/r;",
        "c",
        "(Lcom/whoop/hrZones/network/ZoneID;)Ln71/r;",
        "Lyg2/d$a;",
        "state",
        "",
        "",
        "a",
        "(Lyg2/d$a;)Ljava/util/List;",
        "Lyg2/d;",
        "Ln71/q;",
        "b",
        "(Lyg2/d;)Ln71/q;",
        "Ljava/util/LinkedList;",
        "Ljava/util/LinkedList;",
        "heartRates",
        "connectivity-common-ui_release"
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
.field public static final b:I = 0x8


# instance fields
.field private final a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    return-void
.end method

.method private final a(Lyg2/d$a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg2/d$a;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Lyg2/d$a;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object p1, p0, Lyg2/c;->a:Ljava/util/LinkedList;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final c(Lcom/whoop/hrZones/network/ZoneID;)Ln71/r;
    .locals 1

    sget-object v0, Lyg2/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Ln71/r;->ZONE_5:Ln71/r;

    return-object p1

    :pswitch_1
    sget-object p1, Ln71/r;->ZONE_4:Ln71/r;

    return-object p1

    :pswitch_2
    sget-object p1, Ln71/r;->ZONE_3:Ln71/r;

    return-object p1

    :pswitch_3
    sget-object p1, Ln71/r;->ZONE_2:Ln71/r;

    return-object p1

    :pswitch_4
    sget-object p1, Ln71/r;->ZONE_1:Ln71/r;

    return-object p1

    :pswitch_5
    sget-object p1, Ln71/r;->ZONE_0:Ln71/r;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(Lyg2/d;)Ln71/q;
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lyg2/d$a;

    if-eqz v0, :cond_0

    new-instance v1, Ln71/q;

    check-cast p1, Lyg2/d$a;

    invoke-direct {p0, p1}, Lyg2/c;->a(Lyg2/d$a;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lyg2/d$a;->b()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object p1

    invoke-direct {p0, p1}, Lyg2/c;->c(Lcom/whoop/hrZones/network/ZoneID;)Ln71/r;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lyg2/d$b;

    if-eqz v0, :cond_1

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->CALIBRATING:Ln71/r;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lyg2/d$c;

    if-eqz v0, :cond_2

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lyg2/d$d;

    if-eqz v0, :cond_3

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->DISCONNECTED:Ln71/r;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of p1, p1, Lyg2/d$e;

    if-eqz p1, :cond_4

    new-instance v0, Ln71/q;

    sget-object v2, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
