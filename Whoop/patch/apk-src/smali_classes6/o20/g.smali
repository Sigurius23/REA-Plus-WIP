.class public abstract Lo20/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;Ljava/util/List;ZLh20/l1;Lh20/i3;)Lcom/stripe/android/ui/core/elements/FormItemSpec;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "field"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "placeholderOverrideList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "configuration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lh20/l1;->w:Lh20/k1;

    iget-object v4, v1, Lh20/l1;->y:Lh20/k1;

    iget-object v5, v1, Lh20/l1;->x:Lh20/k1;

    iget-object v6, v1, Lh20/l1;->z:Lh20/j1;

    sget-object v7, Lo20/f;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v7, v3

    const/4 v7, 0x1

    const/4 v8, 0x3

    const/4 v9, 0x0

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    new-instance v0, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    const/4 v1, 0x0

    invoke-direct {v0, v9, v1, v8, v9}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p2, :cond_4

    sget-object v1, Lh20/i3;->x:Lh20/i3;

    move-object/from16 v2, p4

    if-eq v2, v1, :cond_4

    return-object v0

    :pswitch_1
    new-instance v10, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-virtual {v1}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v12

    const/16 v17, 0x3d

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lh20/j1;->y:Lh20/j1;

    if-eq v6, v1, :cond_0

    invoke-virtual {v10}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lh20/j1;->x:Lh20/j1;

    if-eq v6, v0, :cond_4

    :cond_0
    return-object v10

    :pswitch_2
    new-instance v1, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    invoke-direct {v1, v9, v7, v9}, Lcom/stripe/android/ui/core/elements/PhoneSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lh20/k1;->y:Lh20/k1;

    if-eq v5, v2, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/PhoneSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lh20/k1;->x:Lh20/k1;

    if-eq v5, v0, :cond_4

    :cond_1
    return-object v1

    :pswitch_3
    new-instance v1, Lcom/stripe/android/ui/core/elements/EmailSpec;

    invoke-direct {v1, v9, v7, v9}, Lcom/stripe/android/ui/core/elements/EmailSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lh20/k1;->y:Lh20/k1;

    if-eq v4, v2, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/EmailSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lh20/k1;->x:Lh20/k1;

    if-eq v4, v0, :cond_4

    :cond_2
    return-object v1

    :pswitch_4
    new-instance v1, Lcom/stripe/android/ui/core/elements/NameSpec;

    invoke-direct {v1, v9, v9, v8, v9}, Lcom/stripe/android/ui/core/elements/NameSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lh20/k1;->y:Lh20/k1;

    if-eq v2, v3, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/NameSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lh20/k1;->x:Lh20/k1;

    if-eq v2, v0, :cond_4

    :cond_3
    return-object v1

    :pswitch_5
    new-instance v10, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-virtual {v1}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v12

    const/16 v17, 0x1d

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lh20/j1;->y:Lh20/j1;

    if-eq v6, v1, :cond_5

    invoke-virtual {v10}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lh20/j1;->x:Lh20/j1;

    if-eq v6, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    return-object v9

    :cond_5
    :goto_1
    return-object v10

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
