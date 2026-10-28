.class public final Lg40/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/r;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg40/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;ZZ)Lg40/z1;
    .locals 11

    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 p2, p1, 0x8

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    move v6, p3

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_2

    move v7, v0

    goto :goto_2

    :cond_2
    move v7, p4

    :goto_2
    const-string p1, "+"

    invoke-static {p0, p1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez v4, :cond_b

    if-eqz p1, :cond_b

    sget-object p1, Lg40/k2;->a:Li93/c;

    const/4 p1, 0x1

    :cond_3
    invoke-static {p0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result p2

    if-gt p1, p2, :cond_c

    const/4 p2, 0x4

    if-ge p1, p2, :cond_c

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const-string p3, "substring(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lb5/g;->b:Lb5/g;

    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    move-result-object p3

    invoke-static {p3}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object p3

    sget-object p4, Lg40/k2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_4
    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg40/g2;

    iget-object v5, v5, Lg40/g2;->a:Ljava/lang/String;

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/g2;

    iget-object v2, v2, Lg40/g2;->b:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_7

    goto :goto_5

    :cond_7
    move-object p2, v1

    :goto_5
    if-eqz p2, :cond_a

    invoke-virtual {p3}, Lb5/g;->d()I

    move-result p4

    move v2, v0

    :goto_6
    if-ge v2, p4, :cond_9

    invoke-virtual {p3, v2}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p2

    goto :goto_7

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_9
    invoke-static {p2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_7

    :cond_a
    move-object p2, v1

    :goto_7
    if-eqz p2, :cond_3

    invoke-static {p2}, Lds/p;->E(Ljava/lang/String;)Lg40/k2;

    move-result-object v1

    goto :goto_8

    :cond_b
    if-eqz v4, :cond_c

    sget-object p1, Lg40/k2;->a:Li93/c;

    invoke-static {v4}, Lds/p;->E(Ljava/lang/String;)Lg40/k2;

    move-result-object v1

    :cond_c
    :goto_8
    sget-object v5, Lm83/a0;->w:Lm83/a0;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lg40/k2;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lg40/k2;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Lg40/k2;->a()Ljava/lang/String;

    move-result-object p1

    move-object v8, v5

    new-instance v5, Lg40/z1;

    move v9, v6

    move v10, v7

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v10}, Lg40/z1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V

    return-object v5

    :cond_d
    move-object v8, v5

    new-instance v2, Lg40/z1;

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lg40/z1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V

    return-object v2
.end method

.method public static b(Lg40/y2;Lzy/c;)Lg40/w2;
    .locals 1

    const-string v0, "sectionFieldElement"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p1}, Lg40/l0;->c(Ljava/util/List;Lzy/c;)Lg40/w2;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/List;Lzy/c;)Lg40/w2;
    .locals 5

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/y2;

    invoke-interface {v2}, Lg40/y2;->i()Lg40/z2;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lg40/w2;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_section"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    new-instance v3, La33/d;

    invoke-direct {v3, v1, p1}, La33/d;-><init>(Ljava/util/List;Lzy/c;)V

    invoke-direct {v0, v2, p0, v3}, Lg40/w2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;La33/d;)V

    return-object v0
.end method


# virtual methods
.method public n(I)I
    .locals 1

    iget v0, p0, Lg40/l0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    return p1

    :pswitch_0
    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public x(I)I
    .locals 1

    iget v0, p0, Lg40/l0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x7

    :goto_0
    return p1

    :pswitch_0
    add-int/lit8 p1, p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
