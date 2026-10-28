.class public final synthetic Lx30/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx30/o;


# direct methods
.method public synthetic constructor <init>(Lx30/o;I)V
    .locals 0

    iput p2, p0, Lx30/n;->w:I

    iput-object p1, p0, Lx30/n;->x:Lx30/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lx30/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg40/e;

    const-string v0, "addressController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lg40/e;->a:Ln53/e;

    iget-object v0, p0, Lx30/n;->x:Lx30/o;

    iget-object v0, v0, Lx30/o;->h:Ln53/e;

    new-instance v1, Lv6/q;

    const/16 v2, 0x16

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lv6/q;-><init>(IB)V

    invoke-static {p1, v0, v1}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lx30/n;->x:Lx30/o;

    iget-object v0, v0, Lx30/o;->b:Lu30/c;

    iget-object v0, v0, Lu30/c;->z:Lu30/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0xa

    if-eqz v0, :cond_5

    const/4 p1, 0x1

    if-eq v0, p1, :cond_1

    const/4 p1, 0x2

    if-ne v0, p1, :cond_0

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    goto/16 :goto_7

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->getEntries()Lt83/a;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/address/FieldType;

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    if-ne v3, v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/FieldType;->getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    goto/16 :goto_7

    :cond_5
    if-eqz p1, :cond_e

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v2, 0x85e

    if-eq v0, v2, :cond_8

    const/16 v2, 0x8db

    if-eq v0, v2, :cond_7

    const/16 v2, 0xa9e

    if-eq v0, v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v0, "US"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_7
    const-string v0, "GB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_8
    const-string v0, "CA"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_9
    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->getEntries()Lt83/a;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/address/FieldType;

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    if-eq v3, v4, :cond_a

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    if-ne v3, v4, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/FieldType;->getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    goto :goto_7

    :cond_e
    :goto_4
    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->getEntries()Lt83/a;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/address/FieldType;

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    if-ne v3, v4, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_10
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/FieldType;->getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_11
    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :goto_7
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
