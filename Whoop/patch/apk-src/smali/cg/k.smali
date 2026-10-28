.class public final synthetic Lcg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcg/j;


# direct methods
.method public synthetic constructor <init>(Lcg/j;I)V
    .locals 0

    iput p2, p0, Lcg/k;->w:I

    iput-object p1, p0, Lcg/k;->x:Lcg/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lcg/k;->w:I

    const/4 v1, 0x2

    const-string v2, "substring(...)"

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    iget-object v5, p0, Lcg/k;->x:Lcg/j;

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-string v0, "hostport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x5b

    invoke-static {p1, v0}, Lyb3/r;->z0(Ljava/lang/String;C)Z

    move-result v0

    const/4 v6, 0x1

    const/4 v7, 0x6

    const/16 v8, 0x3a

    const/4 v9, 0x0

    if-eqz v0, :cond_6

    const/16 v0, 0x5d

    invoke-static {p1, v0, v4, v4, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p1, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ltg/g;->g:Ltg/g;

    invoke-virtual {v6, v4}, Ltg/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->V(Ljava/lang/String;)Lbg/e;

    move-result-object v4

    instance-of v6, v4, Lbg/d;

    if-eqz v6, :cond_4

    move-object v6, v4

    check-cast v6, Lbg/d;

    iget-object v6, v6, Lbg/d;->a:Landroidx/room/c1;

    instance-of v6, v6, Lbg/k;

    if-eqz v6, :cond_4

    add-int/lit8 v6, v0, 0x1

    if-ltz v6, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v9

    :goto_0
    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    move-result v7

    if-ne v7, v8, :cond_2

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_2

    :cond_2
    :goto_1
    if-nez v6, :cond_3

    :goto_2
    new-instance p1, Ll83/k;

    invoke-direct {p1, v4, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected characters after ]"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "non-ipv6 host was enclosed in []-brackets"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unmatched [ or ]"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-array v0, v6, [C

    aput-char v8, v0, v4

    invoke-static {p1, v0, v4, v7}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    sget-object v0, Ltg/g;->g:Ltg/g;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltg/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->V(Ljava/lang/String;)Lbg/e;

    move-result-object v0

    instance-of v1, v0, Lbg/d;

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Lbg/d;

    iget-object v1, v1, Lbg/d;->a:Landroidx/room/c1;

    instance-of v1, v1, Lbg/k;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ipv6 host given without []-brackets"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    invoke-static {v6, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :cond_9
    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lbg/e;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    const-string v1, "<set-?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v5, Lcg/j;->x:Lbg/e;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v5, Lcg/j;->y:Ljava/lang/Integer;

    :cond_a
    return-object v3

    :pswitch_0
    const-string v0, "authority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/iterable/iterableapi/b;

    invoke-direct {v0, p1}, Lcom/iterable/iterableapi/b;-><init>(Ljava/lang/String;)V

    const-string v6, "@"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/iterable/iterableapi/b;->a([Ljava/lang/String;)Ll83/k;

    move-result-object v6

    if-eqz v6, :cond_b

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget v8, v0, Lcom/iterable/iterableapi/b;->c:I

    invoke-virtual {p1, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v6, v0, Lcom/iterable/iterableapi/b;->c:I

    iget-object v2, v5, Lcg/j;->F:Lwe/o;

    invoke-virtual {v2, p1}, Lwe/o;->M(Ljava/lang/String;)V

    iget p1, v0, Lcom/iterable/iterableapi/b;->c:I

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, p1

    iput v2, v0, Lcom/iterable/iterableapi/b;->c:I

    :cond_b
    new-array p1, v4, [Ljava/lang/String;

    new-instance v2, Lcg/k;

    invoke-direct {v2, v5, v1}, Lcg/k;-><init>(Lcg/j;I)V

    invoke-virtual {v0, p1, v2}, Lcom/iterable/iterableapi/b;->c([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v3

    :pswitch_1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbg/l;->c:Lbg/l;

    invoke-static {p1}, Ldt/b;->C(Ljava/lang/String;)Lbg/l;

    move-result-object p1

    iput-object p1, v5, Lcg/j;->w:Lbg/l;

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
