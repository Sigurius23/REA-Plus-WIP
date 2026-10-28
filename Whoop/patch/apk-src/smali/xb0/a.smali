.class public final Lxb0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J!\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0#2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lxb0/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
        "response",
        "",
        "isAiConfirmation",
        "Lwb0/i$d;",
        "g",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;",
        "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "buttonModel",
        "Lny0/a0;",
        "f",
        "(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "dialogModel",
        "Lwb0/e;",
        "e",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/e;",
        "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
        "modalItem",
        "Lwb0/j;",
        "h",
        "(Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lwb0/j;",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        "itemModel",
        "Lwb0/f;",
        "c",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)Lwb0/f;",
        "dialog",
        "Lwb0/d;",
        "d",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/d;",
        "Lec3/l;",
        "Lub0/d;",
        "upstream",
        "Lwb0/i;",
        "i",
        "(Lec3/l;)Lec3/l;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "reducer",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lxb0/a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxa0/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lxa0/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lxb0/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxb0/a;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lxb0/a;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxb0/a;->g(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)Lwb0/f;
    .locals 25

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getBiomarkerName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getBiomarkerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getValue()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getValueText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getUnit()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getIncluded()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getMinValue()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getMaxValue()D

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v13, v0, Lxb0/a;->a:Ljb1/a;

    invoke-virtual {v13, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getValueLabel()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getCalculatedFromBiomarkers()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    const/4 v15, 0x1

    if-eqz v14, :cond_2

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v14, v15

    :goto_2
    xor-int/2addr v15, v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getUnitLabel()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getSubtitle()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getWarning()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getRightIcon()Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_3

    invoke-static/range {v18 .. v18}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v18

    goto :goto_3

    :cond_3
    const/16 v18, 0x0

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getDependentOnBiomarkers()Ljava/util/List;

    move-result-object v19

    if-nez v19, :cond_4

    sget-object v19, Lm83/y;->w:Lm83/y;

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getDependentOnBiomarkersWarning()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-result-object v12

    invoke-direct {v0, v12}, Lxb0/a;->d(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/d;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getCategoricalOptions()Ljava/util/List;

    move-result-object v21

    if-eqz v21, :cond_6

    move-object/from16 v0, v21

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v21, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v22, v2

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;

    move-object/from16 p1, v0

    new-instance v0, Lwb0/c;

    move-object/from16 v20, v2

    move-object/from16 v23, v3

    invoke-virtual/range {v20 .. v20}, Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;->getValue()D

    move-result-wide v2

    move-object/from16 v24, v4

    invoke-virtual/range {v20 .. v20}, Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;->getValueText()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lwb0/c;-><init>(DLjava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move-object/from16 v3, v23

    move-object/from16 v4, v24

    goto :goto_4

    :cond_5
    :goto_5
    move-object/from16 v23, v3

    move-object/from16 v24, v4

    goto :goto_6

    :cond_6
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    const/4 v1, 0x0

    goto :goto_5

    :goto_6
    new-instance v0, Lwb0/f;

    move-object/from16 v20, v12

    move-object/from16 v12, v21

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    move-object/from16 v4, v24

    move-object/from16 v21, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v21}, Lwb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLm91/u;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Lwb0/d;Ljava/util/List;)V

    return-object v1
.end method

.method private final d(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/d;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lwb0/d;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->getTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getSecondaryButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->getTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwb0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private final e(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/e;
    .locals 4

    new-instance v0, Lwb0/e;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object v3

    invoke-direct {p0, v3}, Lxb0/a;->f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->getSecondaryButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lxb0/a;->f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwb0/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lny0/a0;Lny0/a0;)V

    return-object v0
.end method

.method private final f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;
    .locals 13

    new-instance v0, Lny0/a0;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->getTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/16 v11, 0x3fe

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final g(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;
    .locals 22

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getIncluded()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getBiomarkerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getIncluded()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getDependentOnBiomarkers()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_7

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getDependentOnBiomarkers()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_5

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getDependentOnBiomarkersWarning()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-result-object v4

    invoke-direct {v0, v4}, Lxb0/a;->d(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/d;

    move-result-object v4

    goto :goto_3

    :cond_7
    :goto_2
    move-object v4, v5

    :goto_3
    if-eqz v4, :cond_3

    move-object/from16 v21, v4

    goto :goto_4

    :cond_8
    move-object/from16 v21, v5

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getSearchPlaceholder()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getIncludedItemsHeader()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v1

    invoke-static {v1}, Llb1/f1;->e(Lcom/whoop/design/models/items/DividerModel;)Lhy0/e;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getNotIncludedItemsHeader()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v1

    invoke-static {v1}, Llb1/f1;->e(Lcom/whoop/design/models/items/DividerModel;)Lhy0/e;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-direct {v0, v2}, Lxb0/a;->c(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)Lwb0/f;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object v1

    invoke-direct {v0, v1}, Lxb0/a;->f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getBottomSheetButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object v1

    invoke-direct {v0, v1}, Lxb0/a;->f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getExitDialog()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-result-object v1

    invoke-direct {v0, v1}, Lxb0/a;->e(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/e;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getDeleteDialog()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-result-object v1

    invoke-direct {v0, v1}, Lxb0/a;->e(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/e;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getCalculationEducationTitle()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getCalculationEducationDescription()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getTestDeletedModal()Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-direct {v0, v1}, Lxb0/a;->h(Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lwb0/j;

    move-result-object v5

    :cond_a
    move-object/from16 v20, v5

    new-instance v6, Lwb0/i$d;

    move/from16 v17, p2

    invoke-direct/range {v6 .. v21}, Lwb0/i$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/e;Lhy0/e;Ljava/util/List;Lny0/a0;Lny0/a0;Lwb0/e;Lwb0/e;ZLjava/lang/String;Ljava/lang/String;Lwb0/j;Lwb0/d;)V

    return-object v6
.end method

.method private final h(Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lwb0/j;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;->getPrimaryButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lxb0/a;->f(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v2, Lwb0/j;

    invoke-direct {v2, v0, v1, p1}, Lwb0/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lny0/a0;)V

    return-object v2
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final i(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb0/a$a;

    invoke-direct {v0, p1, p0}, Lxb0/a$a;-><init>(Lec3/l;Lxb0/a;)V

    return-object v0
.end method
