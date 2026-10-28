.class public final Lcom/whoop/bot/settings/CoachSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0008H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsResponse;",
        "",
        "title",
        "",
        "settings",
        "",
        "Lcom/whoop/bot/settings/CoachSettingItem;",
        "footer",
        "Lcom/whoop/bot/settings/CoachSettingsFooter;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)V",
        "getTitle",
        "()Ljava/lang/String;",
        "getSettings",
        "()Ljava/util/List;",
        "getFooter",
        "()Lcom/whoop/bot/settings/CoachSettingsFooter;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "bot_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

.field private final settings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/settings/CoachSettingItem;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/bot/settings/CoachSettingsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/settings/CoachSettingItem;",
            ">;",
            "Lcom/whoop/bot/settings/CoachSettingsFooter;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    const-string p1, "WHOOP COACH"

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 7
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 8
    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsFooter;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/bot/settings/CoachSettingsFooter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/settings/CoachSettingsResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)Lcom/whoop/bot/settings/CoachSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/settings/CoachSettingItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/bot/settings/CoachSettingsFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)Lcom/whoop/bot/settings/CoachSettingsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/settings/CoachSettingItem;",
            ">;",
            "Lcom/whoop/bot/settings/CoachSettingsFooter;",
            ")",
            "Lcom/whoop/bot/settings/CoachSettingsResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/settings/CoachSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsResponse;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    iget-object p1, p1, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFooter()Lcom/whoop/bot/settings/CoachSettingsFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    return-object v0
.end method

.method public final getSettings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/settings/CoachSettingItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->settings:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/bot/settings/CoachSettingsResponse;->footer:Lcom/whoop/bot/settings/CoachSettingsFooter;

    const-string v3, ", settings="

    const-string v4, ", footer="

    const-string v5, "CoachSettingsResponse(title="

    invoke-static {v5, v0, v3, v4, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
