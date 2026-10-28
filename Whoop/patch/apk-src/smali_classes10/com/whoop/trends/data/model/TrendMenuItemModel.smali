.class public final Lcom/whoop/trends/data/model/TrendMenuItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;,
        Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB9\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010*\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008+\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00080\u0010-\u001a\u0004\u0008/\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u0010-\u001a\u0004\u00082\u0010\u001d\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "trendMenuItem",
        "Lcom/whoop/design/util/TextResource;",
        "trendMenuDetailText",
        "Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "trendMenuSheet",
        "<init>",
        "(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/TrendMenuItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/MenuItemModel;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "()Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "copy",
        "(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "getTrendMenuItem",
        "getTrendMenuItem$annotations",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "getTrendMenuDetailText",
        "getTrendMenuDetailText$annotations",
        "Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "getTrendMenuSheet",
        "getTrendMenuSheet$annotations",
        "Companion",
        "$serializer",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;


# instance fields
.field private final trendMenuDetailText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_menu_detail_text"
    .end annotation
.end field

.field private final trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_menu_item"
    .end annotation
.end field

.field private final trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_menu_sheet"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->Companion:Lcom/whoop/trends/data/model/TrendMenuItemModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;

    invoke-virtual {p5}, Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)V
    .locals 1

    const-string v0, "trendMenuItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;ILjava/lang/Object;)Lcom/whoop/trends/data/model/TrendMenuItemModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/trends/data/model/TrendMenuItemModel;->copy(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/TrendMenuItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getTrendMenuDetailText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_menu_detail_text"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendMenuItem$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_menu_item"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendMenuSheet$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_menu_sheet"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/TrendMenuItemModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/MenuItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MenuItemModel$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/TrendMenuSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuSheet$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/MenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/trends/data/model/TrendMenuSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/TrendMenuItemModel;
    .locals 1

    const-string v0, "trendMenuItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/trends/data/model/TrendMenuItemModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/trends/data/model/TrendMenuItemModel;-><init>(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/trends/data/model/TrendMenuSheet;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/TrendMenuItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/TrendMenuItemModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    iget-object p1, p1, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getTrendMenuDetailText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTrendMenuItem()Lcom/whoop/design/models/items/MenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    return-object v0
.end method

.method public final getTrendMenuSheet()Lcom/whoop/trends/data/model/TrendMenuSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/MenuItemModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/TrendMenuSheet;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuDetailText:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendMenuItemModel;->trendMenuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TrendMenuItemModel(trendMenuItem="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trendMenuDetailText="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trendMenuSheet="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
