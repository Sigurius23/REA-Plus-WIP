.class public final Lcom/mapbox/maps/extension/style/types/PromoteId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u001d\u0008\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u000fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/mapbox/maps/extension/style/types/PromoteId;",
        "",
        "",
        "propertyName",
        "sourceId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lvu/d;",
        "expression",
        "(Lvu/d;Ljava/lang/String;)V",
        "Lcom/mapbox/bindgen/Value;",
        "toValue$extension_style_release",
        "()Lcom/mapbox/bindgen/Value;",
        "toValue",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/PromoteId;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPropertyName",
        "getSourceId",
        "Lvu/d;",
        "getExpression",
        "()Lvu/d;",
        "Companion",
        "cv/a",
        "extension-style_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcv/a;


# instance fields
.field private final expression:Lvu/d;

.field private final propertyName:Ljava/lang/String;

.field private final sourceId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcv/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/mapbox/maps/extension/style/types/PromoteId;->Companion:Lcv/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    const/4 p2, 0x0

    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/bindgen/Value;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/squareup/wire/n;->h0(Lcom/mapbox/bindgen/Value;)Lvu/d;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :catchall_0
    :cond_0
    iput-object p2, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->expression:Lvu/d;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lvu/d;)V
    .locals 2

    .line 2
    const-string v0, "expression"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Lvu/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lvu/d;Ljava/lang/String;)V
    .locals 1

    const-string v0, "expression"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Value;->toJson()Ljava/lang/String;

    move-result-object p1

    const-string v0, "expression.toJson()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lvu/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Lvu/d;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/maps/extension/style/types/PromoteId;Ljava/lang/String;)Lcom/mapbox/bindgen/Value;
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/extension/style/types/PromoteId;->toValue$lambda$0(Lcom/mapbox/maps/extension/style/types/PromoteId;Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/mapbox/maps/extension/style/types/PromoteId;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/mapbox/maps/extension/style/types/PromoteId;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/extension/style/types/PromoteId;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/PromoteId;

    move-result-object p0

    return-object p0
.end method

.method private static final toValue$lambda$0(Lcom/mapbox/maps/extension/style/types/PromoteId;Ljava/lang/String;)Lcom/mapbox/bindgen/Value;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    invoke-static {p0}, Lcom/mapbox/bindgen/Value;->valueOf(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/PromoteId;
    .locals 1

    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/extension/style/types/PromoteId;

    invoke-direct {v0, p1, p2}, Lcom/mapbox/maps/extension/style/types/PromoteId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/mapbox/maps/extension/style/types/PromoteId;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/mapbox/maps/extension/style/types/PromoteId;

    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    iget-object p1, p1, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getExpression()Lvu/d;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->expression:Lvu/d;

    return-object v0
.end method

.method public final getPropertyName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PromoteId(propertyName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toValue$extension_style_release()Lcom/mapbox/bindgen/Value;
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->propertyName:Ljava/lang/String;

    invoke-static {v0}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    new-instance v1, Lab/g0;

    const/16 v2, 0x19

    invoke-direct {v1, p0, v2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/bindgen/Expected;->getValueOrElse(Lcom/mapbox/bindgen/Expected$Transformer;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "fromJson(propertyName).g\u2026e.valueOf(propertyName) }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/mapbox/bindgen/Value;

    iget-object v1, p0, Lcom/mapbox/maps/extension/style/types/PromoteId;->sourceId:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v2, Lcom/mapbox/bindgen/Value;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object v2

    :cond_0
    return-object v0
.end method
