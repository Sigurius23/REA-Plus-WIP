.class public final Lg40/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg40/p2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg40/d1;->a:I

    const-string v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg40/d1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg40/d1;->a:I

    iput-object p1, p0, Lg40/d1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll3/g;)Lq3/e0;
    .locals 8

    iget v0, p0, Lg40/d1;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ll3/g;->x:Ljava/lang/String;

    iget-object v1, p0, Lg40/d1;->b:Ljava/lang/Object;

    check-cast v1, Lg40/p2;

    instance-of v1, v1, Lg40/l2;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const-string v1, ""

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const-string v3, " "

    invoke-static {v1, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lg40/l0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lg40/l0;-><init>(I)V

    new-instance v0, Lq3/e0;

    new-instance v2, Ll3/g;

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v2, v4, v1, v3}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-direct {v0, v2, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lq3/e0;

    sget-object v1, Lq3/q;->a:Lq3/f0;

    invoke-direct {v0, p1, v1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    :goto_1
    return-object v0

    :pswitch_0
    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/d1;->b:Ljava/lang/Object;

    check-cast v0, Lg40/j2;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lg40/j2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lq3/e0;

    new-instance v2, Ll3/g;

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v2, v4, p1, v3}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance p1, Le10/k0;

    const/16 v3, 0x13

    invoke-direct {p1, v0, v3}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v2, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v1

    :pswitch_1
    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ll3/g;->x:Ljava/lang/String;

    iget-object v1, p0, Lg40/d1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Lq3/e0;

    sget-object v1, Lq3/q;->a:Lq3/f0;

    invoke-direct {v0, p1, v1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    goto/16 :goto_b

    :cond_3
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_4

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v3, 0x30

    if-eq p1, v3, :cond_4

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v3, 0x31

    if-eq p1, v3, :cond_4

    move p1, v1

    goto :goto_2

    :cond_4
    move p1, v2

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v1, :cond_5

    const/4 v3, 0x2

    invoke-static {v3, v0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0xc

    if-le v3, v4, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    move v3, v2

    :goto_3
    if-nez p1, :cond_7

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    move p1, v2

    goto :goto_5

    :cond_7
    :goto_4
    move p1, v1

    :goto_5
    xor-int/2addr p1, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v2

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v4, p1, :cond_8

    const-string v5, " / "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move v3, v2

    move v4, v3

    :goto_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    if-ge v3, v5, :cond_d

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v7, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_8

    :cond_a
    move-object v4, v6

    :goto_8
    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :cond_b
    if-eqz v6, :cond_c

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_7

    :cond_d
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v1, v0}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move v3, v2

    :goto_9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_10

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v5, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_a

    :cond_e
    move-object v3, v6

    :goto_a
    if-eqz v3, :cond_f

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_9

    :cond_10
    new-instance v2, Lg40/c1;

    invoke-direct {v2, v0, v1}, Lg40/c1;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    new-instance v0, Lq3/e0;

    new-instance v1, Ll3/g;

    const/4 v3, 0x6

    invoke-direct {v1, v3, p1, v6}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-direct {v0, v1, v2}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    :goto_b
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
