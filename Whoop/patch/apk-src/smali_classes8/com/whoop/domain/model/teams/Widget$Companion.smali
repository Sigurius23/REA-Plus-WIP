.class public final Lcom/whoop/domain/model/teams/Widget$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/Widget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/Widget$Companion;",
        "",
        "<init>",
        "()V",
        "fromDto",
        "Lcom/whoop/domain/model/teams/Widget;",
        "dto",
        "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
        "core_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/domain/model/teams/Widget$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromDto(Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;)Lcom/whoop/domain/model/teams/Widget;
    .locals 9

    const-string v0, "dto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/Widget;

    sget-object v0, Luq0/a;->a:Luq0/a;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;->getCollection()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Luq0/a;->a(Ljava/lang/String;)Lcom/whoop/community/share/WidgetCollectionName;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;->getCollectionDisplayIndex()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    move-object v4, p1

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/whoop/domain/model/teams/Widget;-><init>(Lcom/whoop/community/share/WidgetCollectionName;ILjava/lang/String;Ldl/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
