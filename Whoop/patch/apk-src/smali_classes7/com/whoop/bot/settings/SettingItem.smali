.class public final Lcom/whoop/bot/settings/SettingItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BE\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\u00072\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\nH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/bot/settings/SettingItem;",
        "",
        "title",
        "Lcom/whoop/design/util/TextResource;",
        "betaTag",
        "body",
        "enabled",
        "",
        "checked",
        "settingKey",
        "",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V",
        "getTitle",
        "()Lcom/whoop/design/util/TextResource;",
        "getBetaTag",
        "getBody",
        "getEnabled",
        "()Z",
        "getChecked",
        "getSettingKey",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
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
.field public static final $stable:I


# instance fields
.field private final betaTag:Lcom/whoop/design/util/TextResource;

.field private final body:Lcom/whoop/design/util/TextResource;

.field private final checked:Z

.field private final enabled:Z

.field private final settingKey:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/bot/settings/SettingItem;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/bot/settings/SettingItem;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingKey"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    .line 7
    iput-boolean p5, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 9
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 10
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :cond_2
    and-int/lit8 p8, p7, 0x8

    const/4 v0, 0x1

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 11
    const-string p6, ""

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 12
    invoke-direct/range {p2 .. p8}, Lcom/whoop/bot/settings/SettingItem;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/settings/SettingItem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/settings/SettingItem;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/bot/settings/SettingItem;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)Lcom/whoop/bot/settings/SettingItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)Lcom/whoop/bot/settings/SettingItem;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingKey"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/settings/SettingItem;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/bot/settings/SettingItem;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/settings/SettingItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/settings/SettingItem;

    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    iget-boolean v3, p1, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    iget-boolean v3, p1, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBetaTag()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getBody()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    return v0
.end method

.method public final getSettingKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/bot/settings/SettingItem;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/bot/settings/SettingItem;->betaTag:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/bot/settings/SettingItem;->body:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, p0, Lcom/whoop/bot/settings/SettingItem;->enabled:Z

    iget-boolean v4, p0, Lcom/whoop/bot/settings/SettingItem;->checked:Z

    iget-object v5, p0, Lcom/whoop/bot/settings/SettingItem;->settingKey:Ljava/lang/String;

    const-string v6, ", betaTag="

    const-string v7, ", body="

    const-string v8, "SettingItem(title="

    invoke-static {v8, v0, v6, v1, v7}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    const-string v6, ", checked="

    invoke-static {v2, v1, v6, v0, v3}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", settingKey="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
