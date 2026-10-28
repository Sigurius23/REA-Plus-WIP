.class public final Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $filteredCountries$delegate$inlined:Lp1/t2;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onCountrySelected$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $selectedCountryCode$inlined:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$selectedCountryCode$inlined:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$onCountrySelected$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$filteredCountries$delegate$inlined:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->invoke(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/2addr v2, v5

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2
    iget-object v2, v0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    const v3, 0x3fd6f2df

    .line 3
    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 4
    new-instance v12, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryFlag()Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u2009\u2009\u2009"

    .line 5
    invoke-static {v4, v5, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-direct {v12, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 8
    sget-object v11, Ly71/o;->p:Ly71/o$c;

    .line 9
    iget-object v3, v0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$selectedCountryCode$inlined:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryCode()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v27

    const v35, 0x7f7ffe

    const/16 v36, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    .line 10
    invoke-static/range {v11 .. v36}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v8

    .line 11
    iget-object v3, v0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$onCountrySelected$inlined:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_5

    .line 13
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_6

    .line 14
    :cond_5
    new-instance v5, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;

    iget-object v3, v0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$onCountrySelected$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v5, v3, v2}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;)V

    .line 15
    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 16
    :cond_6
    move-object v9, v5

    check-cast v9, Lc93/a;

    sget v2, Ly71/o;->q:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit8 v11, v2, 0x6

    const/4 v12, 0x0

    .line 17
    invoke-static/range {v7 .. v12}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    .line 18
    iget-object v2, v0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;->$filteredCountries$delegate$inlined:Lp1/t2;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->access$CountrySelectionContent$lambda$6(Lp1/t2;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-eq v1, v2, :cond_7

    const v1, 0x3fdf8326

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 19
    invoke-static {v1, v2, v4, v10, v6}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_4

    :cond_7
    const v1, 0x3fe0d13f

    .line 20
    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    .line 21
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    return-void

    .line 22
    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

    return-void
.end method
