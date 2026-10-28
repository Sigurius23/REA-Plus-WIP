.class public final Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;",
        "Lwc3/c;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;)V",
        "",
        "ID",
        "Ljava/lang/String;",
        "TYPE",
        "CONTENT",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "advanced-labs_release"
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

.field private static final CONTENT:Ljava/lang/String; = "content"

.field private static final ID:Ljava/lang/String; = "id"

.field public static final INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;

.field private static final TYPE:Ljava/lang/String; = "type"

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;-><init>()V

    sput-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "HormonalContextScreen"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->descriptor$lambda$0(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    sput-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->descriptor:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->$stable:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final descriptor$lambda$0(Lyc3/a;)Ll83/a0;
    .locals 4

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "id"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "type"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;
    .locals 10

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_d

    .line 3
    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    .line 4
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    const-string v3, ""

    if-eqz v2, :cond_1

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    move-object v2, v3

    .line 5
    :cond_2
    const-string v4, "type"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v4, :cond_4

    invoke-static {v4}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    invoke-static {v4}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v4

    .line 6
    :cond_4
    :goto_1
    const-string v4, "content"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_5

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    sget-object v4, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v4}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 7
    :cond_5
    sget-object v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenType;->UNKNOWN:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenType;

    .line 8
    invoke-static {}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenType;->values()[Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenType;

    move-result-object v5

    .line 9
    array-length v6, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_7

    aget-object v8, v5, v7

    .line 10
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move-object v1, v8

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v4, v1

    .line 11
    :goto_4
    sget-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    const/4 v4, 0x1

    if-eq v1, v4, :cond_c

    const/4 p1, 0x2

    if-eq v1, p1, :cond_b

    const/4 p1, 0x3

    if-eq v1, p1, :cond_a

    const/4 p1, 0x4

    if-ne v1, p1, :cond_9

    .line 12
    sget-object p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;

    goto :goto_5

    .line 13
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 14
    :cond_a
    sget-object p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;

    goto :goto_5

    .line 15
    :cond_b
    sget-object p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;->INSTANCE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;

    goto :goto_5

    .line 16
    :cond_c
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->Companion:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$Companion;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;

    .line 18
    :goto_5
    new-instance v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    invoke-direct {v0, v2, v3, p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;)V

    return-object v0

    .line 19
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "HormonalContextScreenSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of HormonalContextScreen is not supported. Avoid calling this method."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;->serialize(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;)V

    return-void
.end method
