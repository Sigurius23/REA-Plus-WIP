.class public final synthetic Lcom/whoop/domain/model/RecordsDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/RecordsDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/domain/model/RecordsDto<",
        "TF;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0017\u0008\u0016\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J#\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "com/whoop/domain/model/RecordsDto.$serializer",
        "F",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/domain/model/RecordsDto;",
        "<init>",
        "()V",
        "Lwc3/c;",
        "typeSerial0",
        "(Lwc3/c;)V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/domain/model/RecordsDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/domain/model/RecordsDto;",
        "",
        "childSerializers",
        "()[Lwc3/c;",
        "typeParametersSerializers",
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


# instance fields
.field private final descriptor:Lyc3/g;

.field private final synthetic typeSerial0:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v1, "com.whoop.domain.model.RecordsDto"

    const/4 v2, 0x3

    invoke-direct {v0, v1, p0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v1, "offset"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v1, "totalCount"

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v1, "records"

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method public constructor <init>(Lwc3/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwc3/c;",
            ")V"
        }
    .end annotation

    const-string v0, "typeSerial0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/whoop/domain/model/RecordsDto$$serializer;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    return-void
.end method

.method private final synthetic getTypeSerial0()Lwc3/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    return-object v0
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    iget-object v1, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v1, 0x3

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/domain/model/RecordsDto;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")",
            "Lcom/whoop/domain/model/RecordsDto<",
            "TF;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "decoder"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v2, v0, Lcom/whoop/domain/model/RecordsDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v1, v2}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v1

    invoke-interface {v1}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v1, v2, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    invoke-interface {v1, v2, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    new-instance v6, Lkotlinx/serialization/internal/ArrayListSerializer;

    iget-object v8, v0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    invoke-direct {v6, v8}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-interface {v1, v2, v4, v6, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/4 v6, 0x7

    move-object v15, v4

    move v14, v5

    move v12, v6

    :goto_0
    move v13, v3

    goto :goto_2

    :cond_0
    move v10, v5

    move v3, v6

    move v8, v3

    move-object v9, v7

    move v7, v8

    :goto_1
    if-eqz v10, :cond_5

    invoke-interface {v1, v2}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_4

    if-eqz v11, :cond_3

    if-eq v11, v5, :cond_2

    if-ne v11, v4, :cond_1

    new-instance v11, Lkotlinx/serialization/internal/ArrayListSerializer;

    iget-object v12, v0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    invoke-direct {v11, v12}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-interface {v1, v2, v4, v11, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    or-int/lit8 v8, v8, 0x4

    goto :goto_1

    :cond_1
    new-instance v1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v1, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v1

    :cond_2
    invoke-interface {v1, v2, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    or-int/lit8 v8, v8, 0x2

    goto :goto_1

    :cond_3
    invoke-interface {v1, v2, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    or-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    move v10, v6

    goto :goto_1

    :cond_5
    move v14, v7

    move v12, v8

    move-object v15, v9

    goto :goto_0

    :goto_2
    invoke-interface {v1, v2}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v11, Lcom/whoop/domain/model/RecordsDto;

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/domain/model/RecordsDto;-><init>(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v11
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/RecordsDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/domain/model/RecordsDto;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "Lcom/whoop/domain/model/RecordsDto<",
            "TF;>;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    invoke-static {p2, p1, v0, v1}, Lcom/whoop/domain/model/RecordsDto;->write$Self$core_release(Lcom/whoop/domain/model/RecordsDto;Lzc3/c;Lyc3/g;Lwc3/c;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/domain/model/RecordsDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/RecordsDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/domain/model/RecordsDto;)V

    return-void
.end method

.method public final typeParametersSerializers()[Lwc3/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto$$serializer;->typeSerial0:Lwc3/c;

    const/4 v1, 0x1

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method
