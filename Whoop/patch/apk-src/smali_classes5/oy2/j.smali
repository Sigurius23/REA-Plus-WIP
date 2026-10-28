.class public final Loy2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loy2/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Loy2/j;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
        "inputType",
        "",
        "",
        "inputConfig",
        "Loy2/h;",
        "a",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;)Loy2/h;",
        "whooplabs_release"
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


# virtual methods
.method public final a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;)Loy2/h;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Loy2/h;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1f

    if-nez p2, :cond_0

    goto/16 :goto_16

    :cond_0
    sget-object v1, Loy2/j$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const-string v1, "hint"

    const/4 v2, 0x0

    const-string v3, "required"

    const-string v4, "input_label"

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Loy2/h$b;->a:Loy2/h$b;

    return-object p1

    :pswitch_1
    new-instance p1, Loy2/h$a;

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/lang/String;

    if-eqz v1, :cond_1

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    :cond_1
    invoke-direct {p1, v0}, Loy2/h$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :pswitch_2
    sget-object p1, Loy2/h$f;->a:Loy2/h$f;

    return-object p1

    :pswitch_3
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "options"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast p2, Ljava/util/List;

    goto :goto_1

    :cond_4
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_c

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_6

    check-cast v2, Ljava/util/Map;

    goto :goto_3

    :cond_6
    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_b

    new-instance v3, Loy2/k;

    const-string v4, "key"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_7

    check-cast v4, Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object v4, v0

    :goto_4
    const-string v5, ""

    if-nez v4, :cond_8

    move-object v4, v5

    :cond_8
    const-string v6, "value"

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/String;

    if-eqz v6, :cond_9

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-object v2, v0

    :goto_5
    if-nez v2, :cond_a

    goto :goto_6

    :cond_a
    move-object v5, v2

    :goto_6
    invoke-direct {v3, v4, v5}, Loy2/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_b
    move-object v3, v0

    :goto_7
    if-eqz v3, :cond_5

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_d
    new-instance p2, Loy2/h$e;

    invoke-direct {p2, p1, v1}, Loy2/h$e;-><init>(Ljava/lang/Boolean;Ljava/util/List;)V

    return-object p2

    :pswitch_4
    move p1, v2

    new-instance v2, Loy2/h$d;

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/Boolean;

    if-eqz v5, :cond_e

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_8

    :cond_e
    move-object v3, v0

    :goto_8
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :cond_f
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v4, p1, Ljava/lang/String;

    if-eqz v4, :cond_10

    check-cast p1, Ljava/lang/String;

    move-object v4, p1

    goto :goto_9

    :cond_10
    move-object v4, v0

    :goto_9
    const-string p1, "row_count"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v5, p1, Ljava/lang/Integer;

    if-eqz v5, :cond_11

    check-cast p1, Ljava/lang/Integer;

    move-object v5, p1

    goto :goto_a

    :cond_11
    move-object v5, v0

    :goto_a
    const-string p1, "min_length"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v6, p1, Ljava/lang/Integer;

    if-eqz v6, :cond_12

    check-cast p1, Ljava/lang/Integer;

    move-object v6, p1

    goto :goto_b

    :cond_12
    move-object v6, v0

    :goto_b
    const-string p1, "max_length"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v7, p1, Ljava/lang/Integer;

    if-eqz v7, :cond_13

    check-cast p1, Ljava/lang/Integer;

    move-object v7, p1

    goto :goto_c

    :cond_13
    move-object v7, v0

    :goto_c
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_14

    check-cast p1, Ljava/lang/String;

    move-object v8, p1

    goto :goto_d

    :cond_14
    move-object v8, v0

    :goto_d
    const-string p1, "min_length_error_text"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_15

    check-cast p1, Ljava/lang/String;

    move-object v9, p1

    goto :goto_e

    :cond_15
    move-object v9, v0

    :goto_e
    const-string p1, "max_length_error_text"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_16

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :cond_16
    move-object v10, v0

    invoke-direct/range {v2 .. v10}, Loy2/h$d;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_5
    move p1, v2

    move-object v2, v3

    new-instance v3, Loy2/h$c;

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/Boolean;

    if-eqz v5, :cond_17

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_f

    :cond_17
    move-object v2, v0

    :goto_f
    if-eqz v2, :cond_18

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_10

    :cond_18
    move v2, p1

    :goto_10
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_19

    check-cast v2, Ljava/lang/String;

    move-object v5, v2

    goto :goto_11

    :cond_19
    move-object v5, v0

    :goto_11
    const-string v2, "min"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_1a

    check-cast v2, Ljava/lang/Integer;

    move-object v6, v2

    goto :goto_12

    :cond_1a
    move-object v6, v0

    :goto_12
    const-string v2, "max"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_1b

    check-cast v2, Ljava/lang/Integer;

    move-object v7, v2

    goto :goto_13

    :cond_1b
    move-object v7, v0

    :goto_13
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1c

    check-cast v1, Ljava/lang/String;

    move-object v8, v1

    goto :goto_14

    :cond_1c
    move-object v8, v0

    :goto_14
    const-string v1, "min_error_text"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1d

    check-cast v1, Ljava/lang/String;

    move-object v9, v1

    goto :goto_15

    :cond_1d
    move-object v9, v0

    :goto_15
    const-string v1, "max_error_text"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/lang/String;

    if-eqz v1, :cond_1e

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    :cond_1e
    move-object v4, p1

    move-object v10, v0

    invoke-direct/range {v3 .. v10}, Loy2/h$c;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_1f
    :goto_16
    return-object v0

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
