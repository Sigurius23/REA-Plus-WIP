.class public final synthetic Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "shepherd_release"
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

.field public static final INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdHistoryResponse"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "afib_history_clear_all_box"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "afib_empty_history"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "paginated_afib_history"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Lwc3/c;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    return-object v3
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;

    invoke-interface {v0, v1, v5, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    sget-object v6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;

    invoke-interface {v0, v1, v4, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    sget-object v6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;

    invoke-interface {v0, v1, v3, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    const/16 v6, 0xf

    move-object v14, v2

    move-object/from16 v17, v3

    move-object/from16 v16, v4

    move-object v15, v5

    move v13, v6

    goto :goto_1

    :cond_0
    move v11, v5

    move v2, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    if-eqz v11, :cond_6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_5

    if-eqz v12, :cond_4

    if-eq v12, v5, :cond_3

    if-eq v12, v4, :cond_2

    if-ne v12, v3, :cond_1

    sget-object v12, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;

    invoke-interface {v0, v1, v3, v12, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    or-int/lit8 v2, v2, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v12}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    sget-object v12, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;

    invoke-interface {v0, v1, v4, v12, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    or-int/lit8 v2, v2, 0x4

    goto :goto_0

    :cond_3
    sget-object v12, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;

    invoke-interface {v0, v1, v5, v12, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    or-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    move v11, v6

    goto :goto_0

    :cond_6
    move v13, v2

    move-object v14, v7

    move-object v15, v8

    move-object/from16 v16, v9

    move-object/from16 v17, v10

    :goto_1
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v12, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;-><init>(ILjava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v12
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->write$Self$shepherd_release(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;)V

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
