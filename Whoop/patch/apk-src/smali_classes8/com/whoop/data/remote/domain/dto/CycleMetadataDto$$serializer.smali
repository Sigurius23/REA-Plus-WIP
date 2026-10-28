.class public final synthetic Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/data/remote/domain/dto/CycleMetadataDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.data.remote.domain.dto.CycleMetadataDto"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strain"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleep"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lwc3/c;

    sget-object v3, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    return-object v2
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v7

    sget-object v2, Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;

    invoke-interface {v0, v1, v4, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    sget-object v4, Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;

    invoke-interface {v0, v1, v3, v4, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    const/4 v4, 0x7

    move-object v15, v2

    move-object/from16 v16, v3

    move v12, v4

    move-wide v13, v7

    goto :goto_1

    :cond_0
    const-wide/16 v7, 0x0

    move v10, v4

    move v2, v5

    move-wide v8, v7

    move-object v7, v6

    :goto_0
    if-eqz v10, :cond_5

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_4

    if-eqz v11, :cond_3

    if-eq v11, v4, :cond_2

    if-ne v11, v3, :cond_1

    sget-object v11, Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SleepDataDto$$serializer;

    invoke-interface {v0, v1, v3, v11, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    or-int/lit8 v2, v2, 0x4

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    sget-object v11, Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;

    invoke-interface {v0, v1, v4, v11, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    or-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v8

    or-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    move v10, v5

    goto :goto_0

    :cond_5
    move v12, v2

    move-object v15, v6

    move-object/from16 v16, v7

    move-wide v13, v8

    :goto_1
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v11, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;-><init>(IJLcom/whoop/data/remote/domain/dto/StrainDataDto;Lcom/whoop/data/remote/domain/dto/SleepDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v11
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->write$Self$core_release(Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;)V

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
