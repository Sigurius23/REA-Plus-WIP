.class public final Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;",
        "Lwc3/c;",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/AchievementsBackgroundStyle;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "design_release"
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

.field public static final INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    invoke-direct {v0}, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    const-string v0, "AchievementsBackgroundStyle"

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->descriptor:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 6

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/AchievementsBackgroundStyle;->DEFAULT:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    .line 3
    invoke-static {}, Lcom/whoop/design/models/AchievementsBackgroundStyle;->values()[Lcom/whoop/design/models/AchievementsBackgroundStyle;

    move-result-object v1

    .line 4
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 5
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/AchievementsBackgroundStyle;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/whoop/design/models/AchievementsBackgroundStyle;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/design/models/AchievementsBackgroundStyle;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->serialize(Lzc3/e;Lcom/whoop/design/models/AchievementsBackgroundStyle;)V

    return-void
.end method
