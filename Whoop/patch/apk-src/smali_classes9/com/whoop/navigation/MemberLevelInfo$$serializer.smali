.class public final synthetic Lcom/whoop/navigation/MemberLevelInfo$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/MemberLevelInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/navigation/MemberLevelInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/navigation/MemberLevelInfo.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/navigation/MemberLevelInfo;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/navigation/MemberLevelInfo;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/navigation/MemberLevelInfo;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "navigation_release"
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

.field public static final INSTANCE:Lcom/whoop/navigation/MemberLevelInfo$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/navigation/MemberLevelInfo$$serializer;

    invoke-direct {v0}, Lcom/whoop/navigation/MemberLevelInfo$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->INSTANCE:Lcom/whoop/navigation/MemberLevelInfo$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.navigation.MemberLevelInfo"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "level"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "experience"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "userId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "progressionLevel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    const/4 v0, 0x5

    new-array v0, v0, [Lwc3/c;

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/whoop/navigation/ProgressionLevel$$serializer;->INSTANCE:Lcom/whoop/navigation/ProgressionLevel$$serializer;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/navigation/MemberLevelInfo;
    .locals 26

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->descriptor:Lyc3/g;

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

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v6

    sget-object v3, Lcom/whoop/navigation/ProgressionLevel$$serializer;->INSTANCE:Lcom/whoop/navigation/ProgressionLevel$$serializer;

    invoke-interface {v0, v1, v4, v3, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/navigation/ProgressionLevel;

    const/16 v4, 0x1f

    move-object/from16 v24, v3

    move/from16 v17, v4

    move/from16 v21, v5

    move-wide/from16 v22, v6

    move-wide/from16 v18, v9

    :goto_0
    move/from16 v20, v2

    goto/16 :goto_3

    :cond_0
    const-wide/16 v9, 0x0

    move v15, v6

    move v2, v7

    move-object v12, v8

    move-wide v13, v9

    move v8, v2

    move v9, v8

    move-wide v10, v13

    :goto_1
    if-eqz v15, :cond_7

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v7

    const/4 v4, -0x1

    if-eq v7, v4, :cond_6

    if-eqz v7, :cond_5

    if-eq v7, v6, :cond_4

    const/4 v4, 0x4

    if-eq v7, v5, :cond_3

    if-eq v7, v3, :cond_2

    if-ne v7, v4, :cond_1

    sget-object v7, Lcom/whoop/navigation/ProgressionLevel$$serializer;->INSTANCE:Lcom/whoop/navigation/ProgressionLevel$$serializer;

    invoke-interface {v0, v1, v4, v7, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/whoop/navigation/ProgressionLevel;

    or-int/lit8 v8, v8, 0x10

    :goto_2
    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v10

    or-int/lit8 v8, v8, 0x8

    goto :goto_2

    :cond_3
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v9

    or-int/lit8 v8, v8, 0x4

    goto :goto_2

    :cond_4
    const/4 v4, 0x4

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v2

    or-int/lit8 v8, v8, 0x2

    goto :goto_2

    :cond_5
    const/4 v4, 0x4

    const/4 v7, 0x0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v13

    or-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_6
    const/4 v7, 0x0

    move v15, v7

    const/4 v4, 0x4

    goto :goto_1

    :cond_7
    move/from16 v17, v8

    move/from16 v21, v9

    move-wide/from16 v22, v10

    move-object/from16 v24, v12

    move-wide/from16 v18, v13

    goto :goto_0

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v16, Lcom/whoop/navigation/MemberLevelInfo;

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lcom/whoop/navigation/MemberLevelInfo;-><init>(IJIIJLcom/whoop/navigation/ProgressionLevel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v16
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/navigation/MemberLevelInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/navigation/MemberLevelInfo;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/navigation/MemberLevelInfo;->write$Self$navigation_release(Lcom/whoop/navigation/MemberLevelInfo;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/navigation/MemberLevelInfo;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/navigation/MemberLevelInfo$$serializer;->serialize(Lzc3/e;Lcom/whoop/navigation/MemberLevelInfo;)V

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
