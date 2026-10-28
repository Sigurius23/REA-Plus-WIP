.class public final Lza2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lza2/r;",
        "",
        "<init>",
        "()V",
        "Lza2/f$c;",
        "domainState",
        "",
        "Lza2/l;",
        "a",
        "(Lza2/f$c;)Ljava/util/List;",
        "Lza2/f;",
        "Lza2/q;",
        "b",
        "(Lza2/f;)Lza2/q;",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lza2/f$c;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/f$c;",
            ")",
            "Ljava/util/List<",
            "Lza2/l;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lza2/f$c;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;

    invoke-virtual {v2}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v2

    sget-object v3, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;

    new-instance v2, Lza2/l;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getCategory()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getTrackingValue()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getBackgroundImageUrlV2()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v6

    sget-object v7, Lcom/whoop/navigation/AppScreen$e4;->w:Lcom/whoop/navigation/AppScreen$e4;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v6

    sget-object v7, Lcom/whoop/navigation/AppScreen$x0;->w:Lcom/whoop/navigation/AppScreen$x0;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    new-instance v6, Lza2/m$a;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct {v6, v7}, Lza2/m$a;-><init>(Lcom/whoop/navigation/e;)V

    goto :goto_3

    :cond_3
    :goto_2
    new-instance v6, Lza2/m$b;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct {v6, v7}, Lza2/m$b;-><init>(Lcom/whoop/navigation/e;)V

    :goto_3
    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getCtaText()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->getTag()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :goto_4
    move-object v10, v1

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    goto :goto_4

    :goto_5
    invoke-direct/range {v2 .. v10}, Lza2/l;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lza2/m;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_5
    return-object p1
.end method


# virtual methods
.method public final b(Lza2/f;)Lza2/q;
    .locals 11

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lza2/f$b;->a:Lza2/f$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lza2/q;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lza2/q;-><init>(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lza2/f$a;

    if-eqz v0, :cond_1

    new-instance v1, Lza2/q;

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lza2/q;-><init>(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lza2/f$c;

    if-eqz v0, :cond_5

    check-cast p1, Lza2/f$c;

    invoke-virtual {p1}, Lza2/f$c;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v1, Lza2/q;

    invoke-direct {p0, p1}, Lza2/r;->a(Lza2/f$c;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lza2/f$c;->f()Lvc2/c;

    move-result-object v0

    invoke-static {v0}, Lvc2/d;->a(Lvc2/c;)Lxc2/d;

    move-result-object v5

    invoke-virtual {p1}, Lza2/f$c;->g()Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lza2/s;->a(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lza2/f$c;->d()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v9}, Lza2/q;-><init>(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    invoke-virtual {p1}, Lza2/f$c;->g()Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lza2/q;

    invoke-virtual {p1}, Lza2/f$c;->g()Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object v0

    invoke-static {v0}, Lza2/s;->a(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;

    move-result-object v6

    invoke-virtual {p1}, Lza2/f$c;->d()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Lza2/q;-><init>(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    new-instance v2, Lza2/q;

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lza2/q;-><init>(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
