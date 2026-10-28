.class public final synthetic Lwz/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwz/h1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lwz/h1;->w:I

    const-string v1, "Required value was null."

    const/4 v2, 0x4

    const/4 v3, -0x1

    const/4 v4, 0x2

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/16 v6, 0xa

    const-string v7, "$this$Json"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "$this$semantics"

    const/4 v11, 0x1

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const-string v13, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lva0/a;

    invoke-static {p1}, Lxa0/b;->i(Lva0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lua0/a;

    invoke-static {p1}, Lxa0/b;->c(Lua0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lx90/b;->e(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lo02/e;

    invoke-static {p1}, Lx70/c;->a(Lo02/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lkd1/l;

    invoke-static {p1}, Lx51/c;->b(Lkd1/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lx51/c;->c(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ll3/r0;

    invoke-static {p1}, Lx31/f;->o(Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Li3/z;

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v12

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Li3/z;

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v12

    :pswitch_a
    check-cast p1, Lad3/g;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v11, p1, Lad3/g;->c:Z

    const-string v0, "#class"

    iput-object v0, p1, Lad3/g;->h:Ljava/lang/String;

    iput-boolean v11, p1, Lad3/g;->g:Z

    return-object v12

    :pswitch_b
    check-cast p1, Lyb3/k;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->a0(Ljava/lang/CharSequence;)C

    move-result p1

    add-int/lit8 p1, p1, -0x37

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lad3/g;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v11, p1, Lad3/g;->c:Z

    return-object v12

    :pswitch_d
    check-cast p1, Lg40/s3;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx43/j;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ly00/i;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg40/q3;

    iget p1, p1, Ly00/i;->z:I

    invoke-direct {v0, p1, v9, v8, v6}, Lg40/q3;-><init>(IZLh02/n0;I)V

    return-object v0

    :pswitch_10
    check-cast p1, Lg40/s3;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx43/j;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly00/i;

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly00/i;->Q:Ly00/i;

    if-ne p1, v0, :cond_0

    const p1, 0x7f140fec

    goto :goto_0

    :cond_0
    const p1, 0x7f140fef

    :goto_0
    new-array v0, v9, [Ljava/lang/Object;

    invoke-static {p1, v0, v5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Li3/z;

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->h:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v12}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v12

    :pswitch_14
    check-cast p1, Ll40/a;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpYear$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v5, p1, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lo73/a;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v2, :cond_2

    invoke-static {v4, v5}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/lit16 v3, v1, 0x7d0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ll40/a;->a(Ljava/lang/String;Ll40/a;)Ll40/a;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_15
    check-cast p1, Ll40/a;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpMonth$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v5, p1, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lo73/a;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v2, :cond_4

    invoke-static {v4, v5}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ll40/a;->a(Ljava/lang/String;Ll40/a;)Ll40/a;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_16
    check-cast p1, Ly00/i;

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPreferredCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p1, Ly00/i;->w:Ljava/lang/String;

    sget-object v2, Ly00/i;->X:Ly00/i;

    if-ne p1, v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v8, v1

    :goto_3
    new-instance p1, Ll40/a;

    invoke-direct {p1, v8, v11}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_17
    check-cast p1, Ly00/i;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    new-instance v1, Ll40/a;

    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    invoke-direct {v1, p1, v11}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/util/List;

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/y2;

    invoke-interface {v1}, Lg40/y2;->i()Lg40/z2;

    move-result-object v1

    invoke-interface {v1}, Lg40/z2;->f()Lec3/f2;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v5}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg40/h1;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_5

    :cond_7
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array v1, v9, [Lec3/l;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lec3/l;

    new-instance v1, Lg40/c;

    const/16 v2, 0xc

    invoke-direct {v1, p1, v2}, Lg40/c;-><init>([Lec3/l;I)V

    move-object p1, v1

    :goto_5
    new-instance v1, Lg40/d;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v0, Ln53/e;

    invoke-direct {v0, p1, v1}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v0

    :pswitch_19
    check-cast p1, Landroid/content/Intent;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v12

    :pswitch_1a
    invoke-static {p1}, Lx01/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lwz/d;

    invoke-static {p1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    return-object p1

    :pswitch_1c
    check-cast p1, Ld00/l;

    if-eqz p1, :cond_8

    iget-object v8, p1, Ld00/l;->H:Ljava/lang/String;

    :cond_8
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
