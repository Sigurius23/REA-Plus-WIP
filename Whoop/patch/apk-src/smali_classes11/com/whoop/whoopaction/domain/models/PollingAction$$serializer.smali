.class public final synthetic Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whoopaction/domain/models/PollingAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/whoopaction/domain/models/PollingAction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/whoopaction/domain/models/PollingAction.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/whoopaction/domain/models/PollingAction;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/PollingAction;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/PollingAction;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;

    invoke-direct {v0}, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.whoopaction.domain.models.PollingAction"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "request"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "frequencyMillis"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timeoutMillis"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pollingTreatment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "onTimeout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x5

    new-array v4, v4, [Lwc3/c;

    sget-object v5, Lcom/whoop/whoopaction/domain/models/Request$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/Request$$serializer;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v2, v4, v0

    const/4 v0, 0x4

    aput-object v3, v4, v0

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/PollingAction;
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/whoop/whoopaction/domain/models/Request$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/Request$$serializer;

    invoke-interface {v0, v1, v7, v2, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whoopaction/domain/models/Request;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v6

    sget-object v9, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v5, v9, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    sget-object v9, Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;

    invoke-interface {v0, v1, v3, v9, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    sget-object v9, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-interface {v0, v1, v4, v9, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/navigation/models/GenericInteraction;

    const/16 v8, 0x1f

    move-object/from16 v22, v3

    move-object/from16 v23, v4

    move-object/from16 v21, v5

    move-wide/from16 v19, v6

    :goto_0
    move-object/from16 v18, v2

    move/from16 v17, v8

    goto/16 :goto_3

    :cond_0
    const-wide/16 v9, 0x0

    move v14, v6

    move-object v2, v8

    move-object v11, v2

    move-object v12, v11

    move-object v13, v12

    move v8, v7

    :goto_1
    if-eqz v14, :cond_7

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v15

    const/4 v7, -0x1

    if-eq v15, v7, :cond_6

    if-eqz v15, :cond_5

    if-eq v15, v6, :cond_4

    if-eq v15, v5, :cond_3

    if-eq v15, v3, :cond_2

    if-ne v15, v4, :cond_1

    sget-object v7, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-interface {v0, v1, v4, v7, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lcom/whoop/navigation/models/GenericInteraction;

    or-int/lit8 v8, v8, 0x10

    :goto_2
    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    sget-object v7, Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;

    invoke-interface {v0, v1, v3, v7, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    or-int/lit8 v8, v8, 0x8

    goto :goto_2

    :cond_3
    sget-object v7, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v5, v7, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ljava/lang/Long;

    or-int/lit8 v8, v8, 0x4

    goto :goto_2

    :cond_4
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v9

    or-int/lit8 v8, v8, 0x2

    goto :goto_2

    :cond_5
    sget-object v7, Lcom/whoop/whoopaction/domain/models/Request$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/Request$$serializer;

    const/4 v15, 0x0

    invoke-interface {v0, v1, v15, v7, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whoopaction/domain/models/Request;

    or-int/lit8 v8, v8, 0x1

    move v7, v15

    goto :goto_1

    :cond_6
    const/4 v15, 0x0

    move v7, v15

    move v14, v7

    goto :goto_1

    :cond_7
    move-wide/from16 v19, v9

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    goto :goto_0

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v16, Lcom/whoop/whoopaction/domain/models/PollingAction;

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v24}, Lcom/whoop/whoopaction/domain/models/PollingAction;-><init>(ILcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v16
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/PollingAction;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/whoopaction/domain/models/PollingAction;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/whoopaction/domain/models/PollingAction;->write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/PollingAction;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/whoopaction/domain/models/PollingAction;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->serialize(Lzc3/e;Lcom/whoop/whoopaction/domain/models/PollingAction;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-super {p0}, Lkotlinx/serialization/internal/GeneratedSerializer;->typeParametersSerializers()[Lwc3/c;

    move-result-object v0

    return-object v0
.end method
