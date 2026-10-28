.class public final synthetic Luk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Luk2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Luk2/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lv01/l;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lv01/c;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lv01/c;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lv01/c;->n(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lv01/c;->d(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.intent.action.PROCESS_TEXT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "text/plain"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/content/pm/ResolveInfo;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-boolean v6, v5, Landroid/content/pm/ActivityInfo;->exported:Z

    if-eqz v6, :cond_1

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    if-eqz v5, :cond_0

    invoke-virtual {p1, v5}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :pswitch_5
    check-cast p1, Lmh/h;

    invoke-static {p1}, Luz1/t;->c(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lmh/h;

    invoke-static {p1}, Luz1/q;->a(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lm91/q;

    invoke-static {p1}, Luz1/e;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lm91/q;

    invoke-static {p1}, Luw1/e;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Luw0/l;->n(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Li2/g0;

    invoke-static {p1}, Luw0/f;->f(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Luv2/d;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lm91/q;

    invoke-static {p1}, Luu2/w;->s(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Luu2/r;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lus2/c;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lus1/b;->m(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;

    invoke-static {p1}, Lup1/c;->d(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;)Lso1/h;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;

    invoke-static {p1}, Lup1/c;->a(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;

    invoke-static {p1}, Lup1/c;->b(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;)Ltp1/i;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    invoke-static {p1}, Lup1/c;->e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;)Ltp1/l;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;

    invoke-static {p1}, Lup1/c;->g(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;)Ltp1/g;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    invoke-static {p1}, Lup1/c;->c(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;)Ltp1/k;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lup1/c;->f(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lup1/c;->h(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/cache/persistence/a;->o(Ltb/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/cache/persistence/a;->p(Ltb/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lf2/d;

    invoke-static {p1}, Lul0/c;->b(Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lul0/c;->a(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;

    invoke-static {p1}, Luk2/b;->d(Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;)Lyk2/e;

    move-result-object p1

    return-object p1

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
