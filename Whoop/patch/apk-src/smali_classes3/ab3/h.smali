.class public final Lab3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;
    .locals 3

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lab3/h;->c(Ljava/lang/Object;Lu93/e0;)Lab3/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    new-instance p0, Lab3/y;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lo93/h;->r(Lo93/j;)Llb3/c0;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lab3/y;-><init>(Ljava/util/List;Llb3/y;)V

    return-object p0

    :cond_2
    new-instance p0, Lab3/b;

    new-instance p1, Ls;

    const/4 v1, 0x1

    invoke-direct {p1, p2, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v0, p1}, Lab3/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-object p0
.end method

.method public static b(Ljava/util/ArrayList;Llb3/y;)Lab3/y;
    .locals 1

    new-instance v0, Lab3/y;

    invoke-direct {v0, p0, p1}, Lab3/y;-><init>(Ljava/util/List;Llb3/y;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;Lu93/e0;)Lab3/g;
    .locals 6

    instance-of v0, p0, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    new-instance p1, Lab3/d;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    move-result p0

    invoke-direct {p1, p0}, Lab3/d;-><init>(B)V

    return-object p1

    :cond_0
    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_1

    new-instance p1, Lab3/w;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    move-result p0

    invoke-direct {p1, p0}, Lab3/w;-><init>(S)V

    return-object p1

    :cond_1
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance p1, Lab3/k;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-direct {p1, p0}, Lab3/k;-><init>(I)V

    return-object p1

    :cond_2
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_3

    new-instance p1, Lab3/u;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lab3/u;-><init>(J)V

    return-object p1

    :cond_3
    instance-of v0, p0, Ljava/lang/Character;

    if-eqz v0, :cond_4

    new-instance p1, Lab3/e;

    check-cast p0, Ljava/lang/Character;

    invoke-direct {p1, p0}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance p1, Lab3/c;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-direct {p1, p0}, Lab3/c;-><init>(F)V

    return-object p1

    :cond_5
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_6

    new-instance p1, Lab3/c;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lab3/c;-><init>(D)V

    return-object p1

    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    new-instance p1, Lab3/c;

    check-cast p0, Ljava/lang/Boolean;

    invoke-direct {p1, p0}, Lab3/c;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_7
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_8

    new-instance p1, Lab3/x;

    check-cast p0, Ljava/lang/String;

    invoke-direct {p1, p0}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_8
    instance-of v0, p0, [B

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_b

    check-cast p0, [B

    array-length v0, p0

    if-eqz v0, :cond_a

    if-eq v0, v2, :cond_9

    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p0

    :goto_0
    if-ge v3, v0, :cond_a

    aget-byte v2, p0, v3

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    aget-byte p0, p0, v3

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_a
    sget-object p0, Lo93/j;->H:Lo93/j;

    invoke-static {v1, p1, p0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_b
    instance-of v0, p0, [S

    if-eqz v0, :cond_e

    check-cast p0, [S

    array-length v0, p0

    if-eqz v0, :cond_d

    if-eq v0, v2, :cond_c

    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p0

    :goto_1
    if-ge v3, v0, :cond_d

    aget-short v2, p0, v3

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_c
    aget-short p0, p0, v3

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_d
    sget-object p0, Lo93/j;->I:Lo93/j;

    invoke-static {v1, p1, p0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_e
    instance-of v0, p0, [I

    if-eqz v0, :cond_f

    check-cast p0, [I

    invoke-static {p0}, Lm83/n;->U0([I)Ljava/util/List;

    move-result-object p0

    sget-object v0, Lo93/j;->J:Lo93/j;

    invoke-static {p0, p1, v0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_f
    instance-of v0, p0, [J

    if-eqz v0, :cond_10

    check-cast p0, [J

    invoke-static {p0}, Lm83/n;->V0([J)Ljava/util/List;

    move-result-object p0

    sget-object v0, Lo93/j;->L:Lo93/j;

    invoke-static {p0, p1, v0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_10
    instance-of v0, p0, [C

    if-eqz v0, :cond_13

    check-cast p0, [C

    array-length v0, p0

    if-eqz v0, :cond_12

    if-eq v0, v2, :cond_11

    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p0

    :goto_2
    if-ge v3, v0, :cond_12

    aget-char v2, p0, v3

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_11
    aget-char p0, p0, v3

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_12
    sget-object p0, Lo93/j;->G:Lo93/j;

    invoke-static {v1, p1, p0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_13
    instance-of v0, p0, [F

    if-eqz v0, :cond_14

    check-cast p0, [F

    invoke-static {p0}, Lm83/n;->T0([F)Ljava/util/List;

    move-result-object p0

    sget-object v0, Lo93/j;->K:Lo93/j;

    invoke-static {p0, p1, v0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_14
    instance-of v0, p0, [D

    if-eqz v0, :cond_17

    check-cast p0, [D

    array-length v0, p0

    if-eqz v0, :cond_16

    if-eq v0, v2, :cond_15

    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p0

    :goto_3
    if-ge v3, v0, :cond_16

    aget-wide v4, p0, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_15
    aget-wide v0, p0, v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_16
    sget-object p0, Lo93/j;->M:Lo93/j;

    invoke-static {v1, p1, p0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_17
    instance-of v0, p0, [Z

    if-eqz v0, :cond_18

    check-cast p0, [Z

    invoke-static {p0}, Lm83/n;->X0([Z)Ljava/util/List;

    move-result-object p0

    sget-object v0, Lo93/j;->F:Lo93/j;

    invoke-static {p0, p1, v0}, Lab3/h;->a(Ljava/util/List;Lr93/b0;Lo93/j;)Lab3/b;

    move-result-object p0

    return-object p0

    :cond_18
    const/4 p1, 0x0

    if-nez p0, :cond_19

    new-instance p0, Lab3/v;

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_19
    return-object p1
.end method
