.class public final Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;",
        "Lwc3/c;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;)V",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "weekly-plan_release"
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

.field public static final INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;

    invoke-direct {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;-><init>()V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v1, "GoalScreenContent"

    invoke-static {v1, v0}, Lvf3/b;->c(Ljava/lang/String;[Lyc3/g;)Lyc3/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->descriptor:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;
    .locals 4

    .line 2
    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_7

    .line 3
    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    .line 4
    instance-of v2, v0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v2, :cond_1

    move-object v3, v0

    check-cast v3, Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {v3}, Lkotlinx/serialization/json/JsonObject;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    move-object v2, v0

    check-cast v2, Lkotlinx/serialization/json/JsonObject;

    const-string v3, "range"

    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "value"

    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "usable_range"

    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    .line 6
    :cond_3
    const-string v3, "initial_goal_settings_tiles"

    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "bottom_button"

    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-object v1

    .line 7
    :cond_5
    :goto_2
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2$Companion;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object p1

    .line 8
    :cond_6
    :goto_3
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2$Companion;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object p1

    .line 9
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can only deserialize from JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->deserialize(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 2
    invoke-interface {p1}, Lzc3/e;->encodeNull()V

    return-void

    .line 3
    :cond_0
    instance-of v0, p2, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2$Companion;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_1
    instance-of v0, p2, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2$Companion;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->serialize(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;)V

    return-void
.end method
