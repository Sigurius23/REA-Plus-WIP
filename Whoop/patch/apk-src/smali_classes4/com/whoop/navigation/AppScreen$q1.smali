.class public final Lcom/whoop/navigation/AppScreen$q1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/AppScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q1"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/navigation/AppScreen$q1;",
        "",
        "<init>",
        "()V",
        "",
        "screen",
        "Lcom/whoop/navigation/AppScreen;",
        "d",
        "(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;",
        "c",
        "",
        "featureScreens",
        "a",
        "(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;",
        "Ljava/util/Locale;",
        "kotlin.jvm.PlatformType",
        "locale",
        "Ljava/util/Locale;",
        "navigation_release"
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
    invoke-direct {p0}, Lcom/whoop/navigation/AppScreen$q1;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/navigation/AppScreen$q1;Ljava/lang/String;Ljava/util/Collection;ILjava/lang/Object;)Lcom/whoop/navigation/AppScreen;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/navigation/AppScreen$q1;->a(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;
    .locals 5

    sget-object v0, Lcom/whoop/navigation/AppScreen$x;->w:Lcom/whoop/navigation/AppScreen$x;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_2

    sget-object p1, Lcom/whoop/navigation/AppScreen$x;->w:Lcom/whoop/navigation/AppScreen$x;

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/navigation/AppScreen$b0;->w:Lcom/whoop/navigation/AppScreen$b0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b0;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_5

    sget-object p1, Lcom/whoop/navigation/AppScreen$b0;->w:Lcom/whoop/navigation/AppScreen$b0;

    return-object p1

    :cond_5
    sget-object v0, Lcom/whoop/navigation/AppScreen$l0;->w:Lcom/whoop/navigation/AppScreen$l0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l0;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_7
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_8

    sget-object p1, Lcom/whoop/navigation/AppScreen$l0;->w:Lcom/whoop/navigation/AppScreen$l0;

    return-object p1

    :cond_8
    sget-object v0, Lcom/whoop/navigation/AppScreen$n0;->w:Lcom/whoop/navigation/AppScreen$n0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n0;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_a
    move-object v1, v3

    :goto_3
    if-eqz v1, :cond_b

    sget-object p1, Lcom/whoop/navigation/AppScreen$n0;->w:Lcom/whoop/navigation/AppScreen$n0;

    return-object p1

    :cond_b
    sget-object v0, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t0;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_4

    :cond_d
    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_e

    sget-object p1, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    return-object p1

    :cond_e
    sget-object v0, Lcom/whoop/navigation/AppScreen$b1;->w:Lcom/whoop/navigation/AppScreen$b1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b1;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_5

    :cond_10
    move-object v1, v3

    :goto_5
    if-eqz v1, :cond_11

    sget-object p1, Lcom/whoop/navigation/AppScreen$b1;->w:Lcom/whoop/navigation/AppScreen$b1;

    return-object p1

    :cond_11
    sget-object v0, Lcom/whoop/navigation/AppScreen$c1;->w:Lcom/whoop/navigation/AppScreen$c1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c1;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_6

    :cond_13
    move-object v1, v3

    :goto_6
    if-eqz v1, :cond_14

    sget-object p1, Lcom/whoop/navigation/AppScreen$c1;->w:Lcom/whoop/navigation/AppScreen$c1;

    return-object p1

    :cond_14
    sget-object v0, Lcom/whoop/navigation/AppScreen$e1;->w:Lcom/whoop/navigation/AppScreen$e1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e1;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_15

    goto :goto_7

    :cond_16
    move-object v1, v3

    :goto_7
    if-eqz v1, :cond_17

    sget-object p1, Lcom/whoop/navigation/AppScreen$e1;->w:Lcom/whoop/navigation/AppScreen$e1;

    return-object p1

    :cond_17
    sget-object v0, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k1;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_8

    :cond_19
    move-object v1, v3

    :goto_8
    if-eqz v1, :cond_1a

    sget-object p1, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    return-object p1

    :cond_1a
    sget-object v0, Lcom/whoop/navigation/AppScreen$i2;->w:Lcom/whoop/navigation/AppScreen$i2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i2;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1b

    goto :goto_9

    :cond_1c
    move-object v1, v3

    :goto_9
    if-eqz v1, :cond_1d

    sget-object p1, Lcom/whoop/navigation/AppScreen$i2;->w:Lcom/whoop/navigation/AppScreen$i2;

    return-object p1

    :cond_1d
    sget-object v0, Lcom/whoop/navigation/AppScreen$l2;->w:Lcom/whoop/navigation/AppScreen$l2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l2;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1e

    goto :goto_a

    :cond_1f
    move-object v1, v3

    :goto_a
    if-eqz v1, :cond_20

    sget-object p1, Lcom/whoop/navigation/AppScreen$l2;->w:Lcom/whoop/navigation/AppScreen$l2;

    return-object p1

    :cond_20
    sget-object v0, Lcom/whoop/navigation/AppScreen$z2;->w:Lcom/whoop/navigation/AppScreen$z2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z2;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_21

    goto :goto_b

    :cond_22
    move-object v1, v3

    :goto_b
    if-eqz v1, :cond_23

    sget-object p1, Lcom/whoop/navigation/AppScreen$z2;->w:Lcom/whoop/navigation/AppScreen$z2;

    return-object p1

    :cond_23
    sget-object v0, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_24

    goto :goto_c

    :cond_25
    move-object v1, v3

    :goto_c
    if-eqz v1, :cond_26

    sget-object p1, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    return-object p1

    :cond_26
    sget-object v0, Lcom/whoop/navigation/AppScreen$l4;->w:Lcom/whoop/navigation/AppScreen$l4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_27

    goto :goto_d

    :cond_28
    move-object v1, v3

    :goto_d
    if-eqz v1, :cond_29

    sget-object p1, Lcom/whoop/navigation/AppScreen$l4;->w:Lcom/whoop/navigation/AppScreen$l4;

    return-object p1

    :cond_29
    sget-object v0, Lcom/whoop/navigation/AppScreen$m4;->w:Lcom/whoop/navigation/AppScreen$m4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_e

    :cond_2b
    move-object v1, v3

    :goto_e
    if-eqz v1, :cond_2c

    sget-object p1, Lcom/whoop/navigation/AppScreen$m4;->w:Lcom/whoop/navigation/AppScreen$m4;

    return-object p1

    :cond_2c
    sget-object v0, Lcom/whoop/navigation/AppScreen$w4;->w:Lcom/whoop/navigation/AppScreen$w4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2d

    goto :goto_f

    :cond_2e
    move-object v1, v3

    :goto_f
    if-eqz v1, :cond_2f

    sget-object p1, Lcom/whoop/navigation/AppScreen$w4;->w:Lcom/whoop/navigation/AppScreen$w4;

    return-object p1

    :cond_2f
    sget-object v0, Lcom/whoop/navigation/AppScreen$x4;->w:Lcom/whoop/navigation/AppScreen$x4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_30

    goto :goto_10

    :cond_31
    move-object v1, v3

    :goto_10
    if-eqz v1, :cond_32

    sget-object p1, Lcom/whoop/navigation/AppScreen$x4;->w:Lcom/whoop/navigation/AppScreen$x4;

    return-object p1

    :cond_32
    sget-object v0, Lcom/whoop/navigation/AppScreen$y4;->w:Lcom/whoop/navigation/AppScreen$y4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y4;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_33

    goto :goto_11

    :cond_34
    move-object v1, v3

    :goto_11
    if-eqz v1, :cond_35

    sget-object p1, Lcom/whoop/navigation/AppScreen$y4;->w:Lcom/whoop/navigation/AppScreen$y4;

    return-object p1

    :cond_35
    sget-object v0, Lcom/whoop/navigation/AppScreen$v5;->w:Lcom/whoop/navigation/AppScreen$v5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v5;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_36

    goto :goto_12

    :cond_37
    move-object v1, v3

    :goto_12
    if-eqz v1, :cond_38

    sget-object p1, Lcom/whoop/navigation/AppScreen$v5;->w:Lcom/whoop/navigation/AppScreen$v5;

    return-object p1

    :cond_38
    sget-object v0, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d6;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_39

    goto :goto_13

    :cond_3a
    move-object v1, v3

    :goto_13
    if-eqz v1, :cond_3b

    sget-object p1, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    return-object p1

    :cond_3b
    sget-object v0, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m6;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3c

    goto :goto_14

    :cond_3d
    move-object v1, v3

    :goto_14
    if-eqz v1, :cond_3e

    sget-object p1, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    return-object p1

    :cond_3e
    sget-object v0, Lcom/whoop/navigation/AppScreen$n6;->w:Lcom/whoop/navigation/AppScreen$n6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n6;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_40

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3f

    goto :goto_15

    :cond_40
    move-object v1, v3

    :goto_15
    if-eqz v1, :cond_41

    sget-object p1, Lcom/whoop/navigation/AppScreen$n6;->w:Lcom/whoop/navigation/AppScreen$n6;

    return-object p1

    :cond_41
    sget-object v0, Lcom/whoop/navigation/AppScreen$r6;->w:Lcom/whoop/navigation/AppScreen$r6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_42
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_43

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_42

    goto :goto_16

    :cond_43
    move-object v1, v3

    :goto_16
    if-eqz v1, :cond_44

    sget-object p1, Lcom/whoop/navigation/AppScreen$r6;->w:Lcom/whoop/navigation/AppScreen$r6;

    return-object p1

    :cond_44
    sget-object v0, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w6;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_45

    goto :goto_17

    :cond_46
    move-object v1, v3

    :goto_17
    if-eqz v1, :cond_47

    sget-object p1, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    return-object p1

    :cond_47
    sget-object v0, Lcom/whoop/navigation/AppScreen$o3;->w:Lcom/whoop/navigation/AppScreen$o3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o3;->getOtherNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_48
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_49

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v4, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_48

    goto :goto_18

    :cond_49
    move-object v1, v3

    :goto_18
    if-eqz v1, :cond_4a

    sget-object p1, Lcom/whoop/navigation/AppScreen$o3;->w:Lcom/whoop/navigation/AppScreen$o3;

    return-object p1

    :cond_4a
    return-object v3
.end method

.method private final d(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;
    .locals 3

    sget-object v0, Lcom/whoop/navigation/AppScreen$c;->w:Lcom/whoop/navigation/AppScreen$c;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/navigation/AppScreen$a;->w:Lcom/whoop/navigation/AppScreen$a;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lcom/whoop/navigation/AppScreen$b;->w:Lcom/whoop/navigation/AppScreen$b;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lcom/whoop/navigation/AppScreen$d;->w:Lcom/whoop/navigation/AppScreen$d;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lcom/whoop/navigation/AppScreen$e;->w:Lcom/whoop/navigation/AppScreen$e;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, Lcom/whoop/navigation/AppScreen$f;->w:Lcom/whoop/navigation/AppScreen$f;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, Lcom/whoop/navigation/AppScreen$g;->w:Lcom/whoop/navigation/AppScreen$g;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, Lcom/whoop/navigation/AppScreen$h;->w:Lcom/whoop/navigation/AppScreen$h;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, Lcom/whoop/navigation/AppScreen$i;->w:Lcom/whoop/navigation/AppScreen$i;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    sget-object v0, Lcom/whoop/navigation/AppScreen$j;->w:Lcom/whoop/navigation/AppScreen$j;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    return-object v0

    :cond_9
    sget-object v0, Lcom/whoop/navigation/AppScreen$k;->w:Lcom/whoop/navigation/AppScreen$k;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return-object v0

    :cond_a
    sget-object v0, Lcom/whoop/navigation/AppScreen$l;->w:Lcom/whoop/navigation/AppScreen$l;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v0

    :cond_b
    sget-object v0, Lcom/whoop/navigation/AppScreen$m;->w:Lcom/whoop/navigation/AppScreen$m;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    sget-object v0, Lcom/whoop/navigation/AppScreen$n;->w:Lcom/whoop/navigation/AppScreen$n;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    sget-object v0, Lcom/whoop/navigation/AppScreen$o;->w:Lcom/whoop/navigation/AppScreen$o;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    return-object v0

    :cond_e
    sget-object v0, Lcom/whoop/navigation/AppScreen$p;->w:Lcom/whoop/navigation/AppScreen$p;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    return-object v0

    :cond_f
    sget-object v0, Lcom/whoop/navigation/AppScreen$q;->w:Lcom/whoop/navigation/AppScreen$q;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    return-object v0

    :cond_10
    sget-object v0, Lcom/whoop/navigation/AppScreen$r;->w:Lcom/whoop/navigation/AppScreen$r;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    return-object v0

    :cond_11
    sget-object v0, Lcom/whoop/navigation/AppScreen$s;->w:Lcom/whoop/navigation/AppScreen$s;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    return-object v0

    :cond_12
    sget-object v0, Lcom/whoop/navigation/AppScreen$t;->w:Lcom/whoop/navigation/AppScreen$t;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    return-object v0

    :cond_13
    sget-object v0, Lcom/whoop/navigation/AppScreen$u;->w:Lcom/whoop/navigation/AppScreen$u;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    return-object v0

    :cond_14
    sget-object v0, Lcom/whoop/navigation/AppScreen$v;->w:Lcom/whoop/navigation/AppScreen$v;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    return-object v0

    :cond_15
    sget-object v0, Lcom/whoop/navigation/AppScreen$w;->w:Lcom/whoop/navigation/AppScreen$w;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v0

    :cond_16
    sget-object v0, Lcom/whoop/navigation/AppScreen$x;->w:Lcom/whoop/navigation/AppScreen$x;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    return-object v0

    :cond_17
    sget-object v0, Lcom/whoop/navigation/AppScreen$y;->w:Lcom/whoop/navigation/AppScreen$y;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    return-object v0

    :cond_18
    sget-object v0, Lcom/whoop/navigation/AppScreen$z;->w:Lcom/whoop/navigation/AppScreen$z;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    return-object v0

    :cond_19
    sget-object v0, Lcom/whoop/navigation/AppScreen$a0;->w:Lcom/whoop/navigation/AppScreen$a0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    return-object v0

    :cond_1a
    sget-object v0, Lcom/whoop/navigation/AppScreen$b0;->w:Lcom/whoop/navigation/AppScreen$b0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    return-object v0

    :cond_1b
    sget-object v0, Lcom/whoop/navigation/AppScreen$c0;->w:Lcom/whoop/navigation/AppScreen$c0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    return-object v0

    :cond_1c
    sget-object v0, Lcom/whoop/navigation/AppScreen$d0;->w:Lcom/whoop/navigation/AppScreen$d0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    return-object v0

    :cond_1d
    sget-object v0, Lcom/whoop/navigation/AppScreen$e0;->w:Lcom/whoop/navigation/AppScreen$e0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    return-object v0

    :cond_1e
    sget-object v0, Lcom/whoop/navigation/AppScreen$f0;->w:Lcom/whoop/navigation/AppScreen$f0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    return-object v0

    :cond_1f
    sget-object v0, Lcom/whoop/navigation/AppScreen$g0;->w:Lcom/whoop/navigation/AppScreen$g0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    return-object v0

    :cond_20
    sget-object v0, Lcom/whoop/navigation/AppScreen$h0;->w:Lcom/whoop/navigation/AppScreen$h0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    return-object v0

    :cond_21
    sget-object v0, Lcom/whoop/navigation/AppScreen$i0;->w:Lcom/whoop/navigation/AppScreen$i0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    return-object v0

    :cond_22
    sget-object v0, Lcom/whoop/navigation/AppScreen$j0;->w:Lcom/whoop/navigation/AppScreen$j0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    return-object v0

    :cond_23
    sget-object v0, Lcom/whoop/navigation/AppScreen$k0;->w:Lcom/whoop/navigation/AppScreen$k0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    return-object v0

    :cond_24
    sget-object v0, Lcom/whoop/navigation/AppScreen$l0;->w:Lcom/whoop/navigation/AppScreen$l0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    return-object v0

    :cond_25
    sget-object v0, Lcom/whoop/navigation/AppScreen$m0;->w:Lcom/whoop/navigation/AppScreen$m0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    return-object v0

    :cond_26
    sget-object v0, Lcom/whoop/navigation/AppScreen$n0;->w:Lcom/whoop/navigation/AppScreen$n0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    return-object v0

    :cond_27
    sget-object v0, Lcom/whoop/navigation/AppScreen$o0;->w:Lcom/whoop/navigation/AppScreen$o0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    return-object v0

    :cond_28
    sget-object v0, Lcom/whoop/navigation/AppScreen$p0;->w:Lcom/whoop/navigation/AppScreen$p0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    return-object v0

    :cond_29
    sget-object v0, Lcom/whoop/navigation/AppScreen$q0;->w:Lcom/whoop/navigation/AppScreen$q0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    return-object v0

    :cond_2a
    sget-object v0, Lcom/whoop/navigation/AppScreen$r0;->w:Lcom/whoop/navigation/AppScreen$r0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    return-object v0

    :cond_2b
    sget-object v0, Lcom/whoop/navigation/AppScreen$s0;->w:Lcom/whoop/navigation/AppScreen$s0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    return-object v0

    :cond_2c
    sget-object v0, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    return-object v0

    :cond_2d
    sget-object v0, Lcom/whoop/navigation/AppScreen$u0;->w:Lcom/whoop/navigation/AppScreen$u0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    return-object v0

    :cond_2e
    sget-object v0, Lcom/whoop/navigation/AppScreen$v0;->w:Lcom/whoop/navigation/AppScreen$v0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    return-object v0

    :cond_2f
    sget-object v0, Lcom/whoop/navigation/AppScreen$w0;->w:Lcom/whoop/navigation/AppScreen$w0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    return-object v0

    :cond_30
    sget-object v0, Lcom/whoop/navigation/AppScreen$x0;->w:Lcom/whoop/navigation/AppScreen$x0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    return-object v0

    :cond_31
    sget-object v0, Lcom/whoop/navigation/AppScreen$y0;->w:Lcom/whoop/navigation/AppScreen$y0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_32

    return-object v0

    :cond_32
    sget-object v0, Lcom/whoop/navigation/AppScreen$z0;->w:Lcom/whoop/navigation/AppScreen$z0;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    return-object v0

    :cond_33
    sget-object v0, Lcom/whoop/navigation/AppScreen$a1;->w:Lcom/whoop/navigation/AppScreen$a1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    return-object v0

    :cond_34
    sget-object v0, Lcom/whoop/navigation/AppScreen$b1;->w:Lcom/whoop/navigation/AppScreen$b1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    return-object v0

    :cond_35
    sget-object v0, Lcom/whoop/navigation/AppScreen$c1;->w:Lcom/whoop/navigation/AppScreen$c1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    return-object v0

    :cond_36
    sget-object v0, Lcom/whoop/navigation/AppScreen$d1;->w:Lcom/whoop/navigation/AppScreen$d1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    return-object v0

    :cond_37
    sget-object v0, Lcom/whoop/navigation/AppScreen$f1;->w:Lcom/whoop/navigation/AppScreen$f1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_38

    return-object v0

    :cond_38
    sget-object v0, Lcom/whoop/navigation/AppScreen$e1;->w:Lcom/whoop/navigation/AppScreen$e1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_39

    return-object v0

    :cond_39
    sget-object v0, Lcom/whoop/navigation/AppScreen$g1;->w:Lcom/whoop/navigation/AppScreen$g1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3a

    return-object v0

    :cond_3a
    sget-object v0, Lcom/whoop/navigation/AppScreen$j1;->w:Lcom/whoop/navigation/AppScreen$j1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    return-object v0

    :cond_3b
    sget-object v0, Lcom/whoop/navigation/AppScreen$i1;->w:Lcom/whoop/navigation/AppScreen$i1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3c

    return-object v0

    :cond_3c
    sget-object v0, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    return-object v0

    :cond_3d
    sget-object v0, Lcom/whoop/navigation/AppScreen$l1;->w:Lcom/whoop/navigation/AppScreen$l1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3e

    return-object v0

    :cond_3e
    sget-object v0, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3f

    return-object v0

    :cond_3f
    sget-object v0, Lcom/whoop/navigation/AppScreen$r1;->w:Lcom/whoop/navigation/AppScreen$r1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_40

    return-object v0

    :cond_40
    sget-object v0, Lcom/whoop/navigation/AppScreen$s1;->w:Lcom/whoop/navigation/AppScreen$s1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_41

    return-object v0

    :cond_41
    sget-object v0, Lcom/whoop/navigation/AppScreen$t1;->w:Lcom/whoop/navigation/AppScreen$t1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_42

    return-object v0

    :cond_42
    sget-object v0, Lcom/whoop/navigation/AppScreen$u1;->w:Lcom/whoop/navigation/AppScreen$u1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    return-object v0

    :cond_43
    sget-object v0, Lcom/whoop/navigation/AppScreen$v1;->w:Lcom/whoop/navigation/AppScreen$v1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_44

    return-object v0

    :cond_44
    sget-object v0, Lcom/whoop/navigation/AppScreen$w1;->w:Lcom/whoop/navigation/AppScreen$w1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    return-object v0

    :cond_45
    sget-object v0, Lcom/whoop/navigation/AppScreen$x1;->w:Lcom/whoop/navigation/AppScreen$x1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_46

    return-object v0

    :cond_46
    sget-object v0, Lcom/whoop/navigation/AppScreen$a2;->w:Lcom/whoop/navigation/AppScreen$a2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_47

    return-object v0

    :cond_47
    sget-object v0, Lcom/whoop/navigation/AppScreen$b2;->w:Lcom/whoop/navigation/AppScreen$b2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_48

    return-object v0

    :cond_48
    sget-object v0, Lcom/whoop/navigation/AppScreen$d2;->w:Lcom/whoop/navigation/AppScreen$d2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_49

    return-object v0

    :cond_49
    sget-object v0, Lcom/whoop/navigation/AppScreen$y1;->w:Lcom/whoop/navigation/AppScreen$y1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4a

    return-object v0

    :cond_4a
    sget-object v0, Lcom/whoop/navigation/AppScreen$z1;->w:Lcom/whoop/navigation/AppScreen$z1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4b

    return-object v0

    :cond_4b
    sget-object v0, Lcom/whoop/navigation/AppScreen$e2;->w:Lcom/whoop/navigation/AppScreen$e2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4c

    return-object v0

    :cond_4c
    sget-object v0, Lcom/whoop/navigation/AppScreen$f2;->w:Lcom/whoop/navigation/AppScreen$f2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4d

    return-object v0

    :cond_4d
    sget-object v0, Lcom/whoop/navigation/AppScreen$g2;->w:Lcom/whoop/navigation/AppScreen$g2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4e

    return-object v0

    :cond_4e
    sget-object v0, Lcom/whoop/navigation/AppScreen$h2;->w:Lcom/whoop/navigation/AppScreen$h2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    return-object v0

    :cond_4f
    sget-object v0, Lcom/whoop/navigation/AppScreen$i2;->w:Lcom/whoop/navigation/AppScreen$i2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    return-object v0

    :cond_50
    sget-object v0, Lcom/whoop/navigation/AppScreen$j2;->w:Lcom/whoop/navigation/AppScreen$j2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_51

    return-object v0

    :cond_51
    sget-object v0, Lcom/whoop/navigation/AppScreen$k2;->w:Lcom/whoop/navigation/AppScreen$k2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_52

    return-object v0

    :cond_52
    sget-object v0, Lcom/whoop/navigation/AppScreen$l2;->w:Lcom/whoop/navigation/AppScreen$l2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_53

    return-object v0

    :cond_53
    sget-object v0, Lcom/whoop/navigation/AppScreen$m2;->w:Lcom/whoop/navigation/AppScreen$m2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_54

    return-object v0

    :cond_54
    sget-object v0, Lcom/whoop/navigation/AppScreen$n2;->w:Lcom/whoop/navigation/AppScreen$n2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_55

    return-object v0

    :cond_55
    sget-object v0, Lcom/whoop/navigation/AppScreen$o2;->w:Lcom/whoop/navigation/AppScreen$o2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_56

    return-object v0

    :cond_56
    sget-object v0, Lcom/whoop/navigation/AppScreen$p2;->w:Lcom/whoop/navigation/AppScreen$p2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_57

    return-object v0

    :cond_57
    sget-object v0, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_58

    return-object v0

    :cond_58
    sget-object v0, Lcom/whoop/navigation/AppScreen$r2;->w:Lcom/whoop/navigation/AppScreen$r2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_59

    return-object v0

    :cond_59
    sget-object v0, Lcom/whoop/navigation/AppScreen$s2;->w:Lcom/whoop/navigation/AppScreen$s2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5a

    return-object v0

    :cond_5a
    sget-object v0, Lcom/whoop/navigation/AppScreen$t2;->w:Lcom/whoop/navigation/AppScreen$t2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5b

    return-object v0

    :cond_5b
    sget-object v0, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5c

    return-object v0

    :cond_5c
    sget-object v0, Lcom/whoop/navigation/AppScreen$v2;->w:Lcom/whoop/navigation/AppScreen$v2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5d

    return-object v0

    :cond_5d
    sget-object v0, Lcom/whoop/navigation/AppScreen$w2;->w:Lcom/whoop/navigation/AppScreen$w2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5e

    return-object v0

    :cond_5e
    sget-object v0, Lcom/whoop/navigation/AppScreen$x2;->w:Lcom/whoop/navigation/AppScreen$x2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5f

    return-object v0

    :cond_5f
    sget-object v0, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_60

    return-object v0

    :cond_60
    sget-object v0, Lcom/whoop/navigation/AppScreen$z2;->w:Lcom/whoop/navigation/AppScreen$z2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_61

    return-object v0

    :cond_61
    sget-object v0, Lcom/whoop/navigation/AppScreen$a3;->w:Lcom/whoop/navigation/AppScreen$a3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_62

    return-object v0

    :cond_62
    sget-object v0, Lcom/whoop/navigation/AppScreen$b3;->w:Lcom/whoop/navigation/AppScreen$b3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_63

    return-object v0

    :cond_63
    sget-object v0, Lcom/whoop/navigation/AppScreen$c3;->w:Lcom/whoop/navigation/AppScreen$c3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_64

    return-object v0

    :cond_64
    sget-object v0, Lcom/whoop/navigation/AppScreen$d3;->w:Lcom/whoop/navigation/AppScreen$d3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_65

    return-object v0

    :cond_65
    sget-object v0, Lcom/whoop/navigation/AppScreen$e3;->w:Lcom/whoop/navigation/AppScreen$e3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_66

    return-object v0

    :cond_66
    sget-object v0, Lcom/whoop/navigation/AppScreen$f3;->w:Lcom/whoop/navigation/AppScreen$f3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_67

    return-object v0

    :cond_67
    sget-object v0, Lcom/whoop/navigation/AppScreen$g3;->w:Lcom/whoop/navigation/AppScreen$g3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_68

    return-object v0

    :cond_68
    sget-object v0, Lcom/whoop/navigation/AppScreen$h3;->w:Lcom/whoop/navigation/AppScreen$h3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    return-object v0

    :cond_69
    sget-object v0, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6a

    return-object v0

    :cond_6a
    sget-object v0, Lcom/whoop/navigation/AppScreen$j3;->w:Lcom/whoop/navigation/AppScreen$j3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6b

    return-object v0

    :cond_6b
    sget-object v0, Lcom/whoop/navigation/AppScreen$k3;->w:Lcom/whoop/navigation/AppScreen$k3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6c

    return-object v0

    :cond_6c
    sget-object v0, Lcom/whoop/navigation/AppScreen$l3;->w:Lcom/whoop/navigation/AppScreen$l3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6d

    return-object v0

    :cond_6d
    sget-object v0, Lcom/whoop/navigation/AppScreen$m3;->w:Lcom/whoop/navigation/AppScreen$m3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6e

    return-object v0

    :cond_6e
    sget-object v0, Lcom/whoop/navigation/AppScreen$n3;->w:Lcom/whoop/navigation/AppScreen$n3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6f

    return-object v0

    :cond_6f
    sget-object v0, Lcom/whoop/navigation/AppScreen$o3;->w:Lcom/whoop/navigation/AppScreen$o3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_70

    return-object v0

    :cond_70
    sget-object v0, Lcom/whoop/navigation/AppScreen$p3;->w:Lcom/whoop/navigation/AppScreen$p3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_71

    return-object v0

    :cond_71
    sget-object v0, Lcom/whoop/navigation/AppScreen$r3;->w:Lcom/whoop/navigation/AppScreen$r3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_72

    return-object v0

    :cond_72
    sget-object v0, Lcom/whoop/navigation/AppScreen$q3;->w:Lcom/whoop/navigation/AppScreen$q3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_73

    return-object v0

    :cond_73
    sget-object v0, Lcom/whoop/navigation/AppScreen$s3;->w:Lcom/whoop/navigation/AppScreen$s3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_74

    return-object v0

    :cond_74
    sget-object v0, Lcom/whoop/navigation/AppScreen$t3;->w:Lcom/whoop/navigation/AppScreen$t3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_75

    return-object v0

    :cond_75
    sget-object v0, Lcom/whoop/navigation/AppScreen$u3;->w:Lcom/whoop/navigation/AppScreen$u3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_76

    return-object v0

    :cond_76
    sget-object v0, Lcom/whoop/navigation/AppScreen$v3;->w:Lcom/whoop/navigation/AppScreen$v3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_77

    return-object v0

    :cond_77
    sget-object v0, Lcom/whoop/navigation/AppScreen$w3;->w:Lcom/whoop/navigation/AppScreen$w3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_78

    return-object v0

    :cond_78
    sget-object v0, Lcom/whoop/navigation/AppScreen$x3;->w:Lcom/whoop/navigation/AppScreen$x3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_79

    return-object v0

    :cond_79
    sget-object v0, Lcom/whoop/navigation/AppScreen$y3;->w:Lcom/whoop/navigation/AppScreen$y3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7a

    return-object v0

    :cond_7a
    sget-object v0, Lcom/whoop/navigation/AppScreen$z3;->w:Lcom/whoop/navigation/AppScreen$z3;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z3;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7b

    return-object v0

    :cond_7b
    sget-object v0, Lcom/whoop/navigation/AppScreen$a4;->w:Lcom/whoop/navigation/AppScreen$a4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7c

    return-object v0

    :cond_7c
    sget-object v0, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7d

    return-object v0

    :cond_7d
    sget-object v0, Lcom/whoop/navigation/AppScreen$c4;->w:Lcom/whoop/navigation/AppScreen$c4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7e

    return-object v0

    :cond_7e
    sget-object v0, Lcom/whoop/navigation/AppScreen$d4;->w:Lcom/whoop/navigation/AppScreen$d4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7f

    return-object v0

    :cond_7f
    sget-object v0, Lcom/whoop/navigation/AppScreen$e4;->w:Lcom/whoop/navigation/AppScreen$e4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_80

    return-object v0

    :cond_80
    sget-object v0, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    return-object v0

    :cond_81
    sget-object v0, Lcom/whoop/navigation/AppScreen$f4;->w:Lcom/whoop/navigation/AppScreen$f4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_82

    return-object v0

    :cond_82
    sget-object v0, Lcom/whoop/navigation/AppScreen$r4;->w:Lcom/whoop/navigation/AppScreen$r4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_83

    return-object v0

    :cond_83
    sget-object v0, Lcom/whoop/navigation/AppScreen$h4;->w:Lcom/whoop/navigation/AppScreen$h4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_84

    return-object v0

    :cond_84
    sget-object v0, Lcom/whoop/navigation/AppScreen$i4;->w:Lcom/whoop/navigation/AppScreen$i4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_85

    return-object v0

    :cond_85
    sget-object v0, Lcom/whoop/navigation/AppScreen$j4;->w:Lcom/whoop/navigation/AppScreen$j4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_86

    return-object v0

    :cond_86
    sget-object v0, Lcom/whoop/navigation/AppScreen$k4;->w:Lcom/whoop/navigation/AppScreen$k4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_87

    return-object v0

    :cond_87
    sget-object v0, Lcom/whoop/navigation/AppScreen$l4;->w:Lcom/whoop/navigation/AppScreen$l4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_88

    return-object v0

    :cond_88
    sget-object v0, Lcom/whoop/navigation/AppScreen$m4;->w:Lcom/whoop/navigation/AppScreen$m4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_89

    return-object v0

    :cond_89
    sget-object v0, Lcom/whoop/navigation/AppScreen$n4;->w:Lcom/whoop/navigation/AppScreen$n4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8a

    return-object v0

    :cond_8a
    sget-object v0, Lcom/whoop/navigation/AppScreen$o4;->w:Lcom/whoop/navigation/AppScreen$o4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8b

    return-object v0

    :cond_8b
    sget-object v0, Lcom/whoop/navigation/AppScreen$p4;->w:Lcom/whoop/navigation/AppScreen$p4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8c

    return-object v0

    :cond_8c
    sget-object v0, Lcom/whoop/navigation/AppScreen$q4;->w:Lcom/whoop/navigation/AppScreen$q4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8d

    return-object v0

    :cond_8d
    sget-object v0, Lcom/whoop/navigation/AppScreen$c2;->w:Lcom/whoop/navigation/AppScreen$c2;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c2;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8e

    return-object v0

    :cond_8e
    sget-object v0, Lcom/whoop/navigation/AppScreen$s4;->w:Lcom/whoop/navigation/AppScreen$s4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8f

    return-object v0

    :cond_8f
    sget-object v0, Lcom/whoop/navigation/AppScreen$t4;->w:Lcom/whoop/navigation/AppScreen$t4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_90

    return-object v0

    :cond_90
    sget-object v0, Lcom/whoop/navigation/AppScreen$u4;->w:Lcom/whoop/navigation/AppScreen$u4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    return-object v0

    :cond_91
    sget-object v0, Lcom/whoop/navigation/AppScreen$v4;->w:Lcom/whoop/navigation/AppScreen$v4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_92

    return-object v0

    :cond_92
    sget-object v0, Lcom/whoop/navigation/AppScreen$w4;->w:Lcom/whoop/navigation/AppScreen$w4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_93

    return-object v0

    :cond_93
    sget-object v0, Lcom/whoop/navigation/AppScreen$x4;->w:Lcom/whoop/navigation/AppScreen$x4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_94

    return-object v0

    :cond_94
    sget-object v0, Lcom/whoop/navigation/AppScreen$y4;->w:Lcom/whoop/navigation/AppScreen$y4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_95

    return-object v0

    :cond_95
    sget-object v0, Lcom/whoop/navigation/AppScreen$z4;->w:Lcom/whoop/navigation/AppScreen$z4;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z4;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_96

    return-object v0

    :cond_96
    sget-object v0, Lcom/whoop/navigation/AppScreen$a5;->w:Lcom/whoop/navigation/AppScreen$a5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_97

    return-object v0

    :cond_97
    sget-object v0, Lcom/whoop/navigation/AppScreen$b5;->w:Lcom/whoop/navigation/AppScreen$b5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_98

    return-object v0

    :cond_98
    sget-object v0, Lcom/whoop/navigation/AppScreen$c5;->w:Lcom/whoop/navigation/AppScreen$c5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_99

    return-object v0

    :cond_99
    sget-object v0, Lcom/whoop/navigation/AppScreen$d5;->w:Lcom/whoop/navigation/AppScreen$d5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9a

    return-object v0

    :cond_9a
    sget-object v0, Lcom/whoop/navigation/AppScreen$e5;->w:Lcom/whoop/navigation/AppScreen$e5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9b

    return-object v0

    :cond_9b
    sget-object v0, Lcom/whoop/navigation/AppScreen$f5;->w:Lcom/whoop/navigation/AppScreen$f5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9c

    return-object v0

    :cond_9c
    sget-object v0, Lcom/whoop/navigation/AppScreen$g5;->w:Lcom/whoop/navigation/AppScreen$g5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$g5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9d

    return-object v0

    :cond_9d
    sget-object v0, Lcom/whoop/navigation/AppScreen$h5;->w:Lcom/whoop/navigation/AppScreen$h5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9e

    return-object v0

    :cond_9e
    sget-object v0, Lcom/whoop/navigation/AppScreen$i5;->w:Lcom/whoop/navigation/AppScreen$i5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9f

    return-object v0

    :cond_9f
    sget-object v0, Lcom/whoop/navigation/AppScreen$j5;->w:Lcom/whoop/navigation/AppScreen$j5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a0

    return-object v0

    :cond_a0
    sget-object v0, Lcom/whoop/navigation/AppScreen$k5;->w:Lcom/whoop/navigation/AppScreen$k5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a1

    return-object v0

    :cond_a1
    sget-object v0, Lcom/whoop/navigation/AppScreen$l5;->w:Lcom/whoop/navigation/AppScreen$l5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a2

    return-object v0

    :cond_a2
    sget-object v0, Lcom/whoop/navigation/AppScreen$m5;->w:Lcom/whoop/navigation/AppScreen$m5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a3

    return-object v0

    :cond_a3
    sget-object v0, Lcom/whoop/navigation/AppScreen$n5;->w:Lcom/whoop/navigation/AppScreen$n5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a4

    return-object v0

    :cond_a4
    sget-object v0, Lcom/whoop/navigation/AppScreen$o5;->w:Lcom/whoop/navigation/AppScreen$o5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a5

    return-object v0

    :cond_a5
    sget-object v0, Lcom/whoop/navigation/AppScreen$p5;->w:Lcom/whoop/navigation/AppScreen$p5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a6

    return-object v0

    :cond_a6
    sget-object v0, Lcom/whoop/navigation/AppScreen$t5;->w:Lcom/whoop/navigation/AppScreen$t5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a7

    return-object v0

    :cond_a7
    sget-object v0, Lcom/whoop/navigation/AppScreen$r5;->w:Lcom/whoop/navigation/AppScreen$r5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a8

    return-object v0

    :cond_a8
    sget-object v0, Lcom/whoop/navigation/AppScreen$s5;->w:Lcom/whoop/navigation/AppScreen$s5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a9

    return-object v0

    :cond_a9
    sget-object v0, Lcom/whoop/navigation/AppScreen$u5;->w:Lcom/whoop/navigation/AppScreen$u5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_aa

    return-object v0

    :cond_aa
    sget-object v0, Lcom/whoop/navigation/AppScreen$v5;->w:Lcom/whoop/navigation/AppScreen$v5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ab

    return-object v0

    :cond_ab
    sget-object v0, Lcom/whoop/navigation/AppScreen$w5;->w:Lcom/whoop/navigation/AppScreen$w5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ac

    return-object v0

    :cond_ac
    sget-object v0, Lcom/whoop/navigation/AppScreen$x5;->w:Lcom/whoop/navigation/AppScreen$x5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$x5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ad

    return-object v0

    :cond_ad
    sget-object v0, Lcom/whoop/navigation/AppScreen$y5;->w:Lcom/whoop/navigation/AppScreen$y5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$y5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ae

    return-object v0

    :cond_ae
    sget-object v0, Lcom/whoop/navigation/AppScreen$z5;->w:Lcom/whoop/navigation/AppScreen$z5;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$z5;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_af

    return-object v0

    :cond_af
    sget-object v0, Lcom/whoop/navigation/AppScreen$n1;->w:Lcom/whoop/navigation/AppScreen$n1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b0

    return-object v0

    :cond_b0
    sget-object v0, Lcom/whoop/navigation/AppScreen$o1;->w:Lcom/whoop/navigation/AppScreen$o1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b1

    return-object v0

    :cond_b1
    sget-object v0, Lcom/whoop/navigation/AppScreen$p1;->w:Lcom/whoop/navigation/AppScreen$p1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b2

    return-object v0

    :cond_b2
    sget-object v0, Lcom/whoop/navigation/AppScreen$a6;->w:Lcom/whoop/navigation/AppScreen$a6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$a6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b3

    return-object v0

    :cond_b3
    sget-object v0, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$d6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b4

    return-object v0

    :cond_b4
    sget-object v0, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h1;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b5

    return-object v0

    :cond_b5
    sget-object v0, Lcom/whoop/navigation/AppScreen$e6;->w:Lcom/whoop/navigation/AppScreen$e6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$e6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b6

    return-object v0

    :cond_b6
    sget-object v0, Lcom/whoop/navigation/AppScreen$f6;->w:Lcom/whoop/navigation/AppScreen$f6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$f6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b7

    return-object v0

    :cond_b7
    sget-object v0, Lcom/whoop/navigation/AppScreen$c6;->w:Lcom/whoop/navigation/AppScreen$c6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$c6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b8

    return-object v0

    :cond_b8
    sget-object v0, Lcom/whoop/navigation/AppScreen$b6;->w:Lcom/whoop/navigation/AppScreen$b6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$b6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b9

    return-object v0

    :cond_b9
    sget-object v0, Lcom/whoop/navigation/AppScreen$i6;->w:Lcom/whoop/navigation/AppScreen$i6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$i6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ba

    return-object v0

    :cond_ba
    sget-object v0, Lcom/whoop/navigation/AppScreen$h6;->w:Lcom/whoop/navigation/AppScreen$h6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$h6;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_bb

    return-object v0

    :cond_bb
    const-string v0, "URL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_bc

    new-instance p1, Lcom/whoop/navigation/AppScreen$URLScreen;

    const/4 v0, 0x1

    invoke-direct {p1, v1, v0, v1}, Lcom/whoop/navigation/AppScreen$URLScreen;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_bc
    sget-object v0, Lcom/whoop/navigation/AppScreen$j6;->w:Lcom/whoop/navigation/AppScreen$j6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$j6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bd

    return-object v0

    :cond_bd
    sget-object v0, Lcom/whoop/navigation/AppScreen$k6;->w:Lcom/whoop/navigation/AppScreen$k6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$k6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_be

    return-object v0

    :cond_be
    sget-object v0, Lcom/whoop/navigation/AppScreen$l6;->w:Lcom/whoop/navigation/AppScreen$l6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$l6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bf

    return-object v0

    :cond_bf
    sget-object v0, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$m6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c0

    return-object v0

    :cond_c0
    sget-object v0, Lcom/whoop/navigation/AppScreen$n6;->w:Lcom/whoop/navigation/AppScreen$n6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$n6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c1

    return-object v0

    :cond_c1
    sget-object v0, Lcom/whoop/navigation/AppScreen$o6;->w:Lcom/whoop/navigation/AppScreen$o6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$o6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c2

    return-object v0

    :cond_c2
    sget-object v0, Lcom/whoop/navigation/AppScreen$p6;->w:Lcom/whoop/navigation/AppScreen$p6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$p6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c3

    return-object v0

    :cond_c3
    sget-object v0, Lcom/whoop/navigation/AppScreen$q6;->w:Lcom/whoop/navigation/AppScreen$q6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$q6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c4

    return-object v0

    :cond_c4
    sget-object v0, Lcom/whoop/navigation/AppScreen$r6;->w:Lcom/whoop/navigation/AppScreen$r6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$r6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c5

    return-object v0

    :cond_c5
    sget-object v0, Lcom/whoop/navigation/AppScreen$s6;->w:Lcom/whoop/navigation/AppScreen$s6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$s6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c6

    return-object v0

    :cond_c6
    sget-object v0, Lcom/whoop/navigation/AppScreen$t6;->w:Lcom/whoop/navigation/AppScreen$t6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$t6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c7

    return-object v0

    :cond_c7
    sget-object v0, Lcom/whoop/navigation/AppScreen$u6;->w:Lcom/whoop/navigation/AppScreen$u6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$u6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c8

    return-object v0

    :cond_c8
    sget-object v0, Lcom/whoop/navigation/AppScreen$v6;->w:Lcom/whoop/navigation/AppScreen$v6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$v6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c9

    return-object v0

    :cond_c9
    sget-object v0, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen$w6;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_ca

    return-object v0

    :cond_ca
    return-object v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/navigation/AppScreen;"
        }
    .end annotation

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureScreens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/navigation/AppScreen;->access$getLocale$cp()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "access$getLocale$cp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/navigation/AppScreen$q1;->d(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/navigation/AppScreen$q1;->c(Ljava/lang/String;)Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v2, p1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    new-instance p1, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    const/4 p2, 0x2

    invoke-direct {p1, v0, v1, p2, v1}, Lcom/whoop/navigation/FeatureSpecificAppScreen;-><init>(Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_4
    sget-object p1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    return-object p1
.end method
