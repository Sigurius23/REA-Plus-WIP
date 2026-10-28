.class public abstract Le40/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldo0/c;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    return-void
.end method

.method public static final a(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z
    .locals 2

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final b(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "countryCode"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    if-eq v5, v6, :cond_0

    invoke-virtual {v4}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    if-ne v4, v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/uicore/address/FieldType;->getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getSchema()Lcom/stripe/android/uicore/address/FieldSchema;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-virtual {v11}, Lcom/stripe/android/uicore/address/FieldSchema;->getNameType()Lcom/stripe/android/uicore/address/NameType;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-virtual {v11}, Lcom/stripe/android/uicore/address/NameType;->getStringResId()I

    move-result v11

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/uicore/address/FieldType;->getDefaultLabel()I

    move-result v11

    :goto_2
    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/uicore/address/FieldType;->capitalization-IUNYP9k()I

    move-result v15

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getSchema()Lcom/stripe/android/uicore/address/FieldSchema;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v12}, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric()Z

    move-result v12

    if-ne v12, v8, :cond_5

    const/16 v12, 0x8

    move/from16 v16, v12

    goto :goto_3

    :cond_5
    move/from16 v16, v8

    :goto_3
    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getRequired()Z

    move-result v3

    xor-int/2addr v3, v8

    new-instance v12, Lg40/c3;

    new-instance v13, Lg40/f3;

    sget-object v20, Le40/h;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v20, v14

    if-ne v14, v5, :cond_6

    new-instance v14, Lg40/r2;

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v11, v6, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    invoke-direct {v14, v4, v0, v3}, Lg40/r2;-><init>(Lzy/b;Ljava/lang/String;Z)V

    move-object v3, v13

    goto :goto_4

    :cond_6
    move-object v14, v13

    new-instance v13, Lg40/d3;

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v11, v6, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    const/16 v17, 0x0

    const/16 v19, 0x8

    move/from16 v18, v3

    move-object v3, v14

    move-object v14, v4

    invoke-direct/range {v13 .. v19}, Lg40/d3;-><init>(Lzy/b;IILec3/h2;ZI)V

    move-object v14, v13

    :goto_4
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v20, v4

    if-ne v4, v5, :cond_7

    new-instance v4, Ldo0/c;

    const/16 v6, 0x15

    invoke-direct {v4, v6}, Ldo0/c;-><init>(I)V

    goto :goto_5

    :cond_7
    move-object v4, v7

    :goto_5
    invoke-direct {v3, v14, v7, v4, v5}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    invoke-direct {v12, v10, v3}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v20, v3

    if-ne v3, v8, :cond_a

    const-string v3, "CA"

    const-string v4, "US"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v3, Lg40/p;

    invoke-direct {v3}, Lg40/p;-><init>()V

    goto :goto_6

    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v3, Lg40/q;

    invoke-direct {v3}, Lg40/q;-><init>()V

    :goto_6
    new-instance v4, Lg40/r;

    new-instance v5, Lg40/r0;

    new-instance v6, La30/w0;

    invoke-direct {v6, v3}, La30/w0;-><init>(Lvd/f;)V

    invoke-direct {v5, v6, v7}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    invoke-direct {v4, v10, v5}, Lg40/r;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    move-object v7, v4

    goto :goto_7

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_a
    move-object v7, v12

    :cond_b
    :goto_7
    if-eqz v7, :cond_3

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v6

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v9, v2, 0x1

    if-ltz v2, :cond_f

    check-cast v3, Lg40/b3;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_d

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg40/b3;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg40/b3;

    invoke-virtual {v10}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-static {v10}, Le40/i;->a(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-virtual {v11}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-static {v10}, Le40/i;->a(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z

    move-result v10

    if-eqz v10, :cond_d

    new-array v3, v5, [Lg40/b3;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v6

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v8

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v4, Ljava/util/Collection;

    new-instance v3, Lg40/t2;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v11

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "row_"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    new-instance v11, Lg40/s2;

    invoke-direct {v11, v2}, Lg40/s2;-><init>(Ljava/util/List;)V

    invoke-direct {v3, v10, v2, v11}, Lg40/t2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lg40/s2;)V

    invoke-static {v3, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    :goto_9
    move-object v4, v2

    goto :goto_a

    :cond_d
    invoke-static {v4}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lg40/t2;

    if-eqz v2, :cond_e

    check-cast v4, Ljava/util/Collection;

    invoke-static {v7, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_9

    :cond_e
    check-cast v4, Ljava/util/Collection;

    invoke-static {v3, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_9

    :goto_a
    move v2, v9

    goto/16 :goto_8

    :cond_f
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_10
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
