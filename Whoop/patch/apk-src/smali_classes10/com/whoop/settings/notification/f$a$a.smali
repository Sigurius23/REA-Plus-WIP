.class public final Lcom/whoop/settings/notification/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/notification/f$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/notification/f$a$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/whoop/settings/notification/f$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/settings/notification/f$a$a$a;

    iget v1, v0, Lcom/whoop/settings/notification/f$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/settings/notification/f$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/settings/notification/f$a$a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/settings/notification/f$a$a$a;-><init>(Lcom/whoop/settings/notification/f$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/settings/notification/f$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/settings/notification/f$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/settings/notification/f$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/settings/notification/f$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/settings/notification/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/settings/notification/f$a$a;->w:Lec3/m;

    check-cast p1, Lcom/whoop/settings/notification/b;

    instance-of v2, p1, Lcom/whoop/settings/notification/b$a;

    if-eqz v2, :cond_7

    check-cast p1, Lcom/whoop/settings/notification/b$a;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/b$a;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/domain/model/NotificationSettingDto;

    new-instance v6, Lic2/a;

    invoke-virtual {v5}, Lcom/whoop/domain/model/NotificationSettingDto;->isActive()Z

    move-result v7

    invoke-virtual {v5}, Lcom/whoop/domain/model/NotificationSettingDto;->getNamespace()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5}, Lcom/whoop/domain/model/NotificationSettingDto;->getSubtitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v5}, Lcom/whoop/domain/model/NotificationSettingDto;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v6, v7, v8, v9, v5}, Lic2/a;-><init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/settings/notification/b$a;->b()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getShepherdNotificationToggle()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v6, Lic2/h;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getEnabled()Z

    move-result v7

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v7, v8, v9, v2}, Lic2/h;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/settings/notification/b$a;->b()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getShepherdDetectionToggle()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getEnabled()Z

    move-result p1

    goto :goto_3

    :cond_5
    move p1, v2

    :goto_3
    new-instance v7, Lic2/g;

    invoke-direct {v7, v2, v4, v6, p1}, Lic2/g;-><init>(ZLjava/util/List;Lic2/h;Z)V

    iput-object v5, v0, Lcom/whoop/settings/notification/f$a$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/notification/f$a$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/notification/f$a$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/notification/f$a$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/settings/notification/f$a$a$a;->H:I

    iput v3, v0, Lcom/whoop/settings/notification/f$a$a$a;->x:I

    invoke-interface {p2, v7, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
