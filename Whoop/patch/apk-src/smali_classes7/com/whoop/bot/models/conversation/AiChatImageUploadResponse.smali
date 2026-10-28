.class public final Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$$serializer;,
        Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eB[\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJX\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00083\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010/\u001a\u0004\u00089\u0010\u001d\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;",
        "",
        "",
        "fileId",
        "",
        "userId",
        "filename",
        "contentType",
        "",
        "size",
        "",
        "createdAt",
        "createdAtFormatted",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "()J",
        "component6",
        "()D",
        "component7",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getFileId",
        "I",
        "getUserId",
        "getFilename",
        "getContentType",
        "J",
        "getSize",
        "D",
        "getCreatedAt",
        "getCreatedAtFormatted",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;


# instance fields
.field private final contentType:Ljava/lang/String;

.field private final createdAt:D

.field private final createdAtFormatted:Ljava/lang/String;

.field private final fileId:Ljava/lang/String;

.field private final filename:Ljava/lang/String;

.field private final size:J

.field private final userId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->Companion:Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    iput-wide p6, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    iput-wide p8, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p10, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V
    .locals 1

    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    .line 8
    iput-wide p7, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    .line 9
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v10, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v10, p9

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v10}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-wide p5, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-wide p7, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    :cond_5
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_6

    iget-object p9, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    :cond_6
    move-object p11, p9

    move-wide p9, p7

    move-wide p7, p5

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;
    .locals 11

    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    iget v3, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    iget-wide v5, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    iget-wide v5, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    return-wide v0
.end method

.method public final getCreatedAtFormatted()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    return-wide v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

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
    .locals 12

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->fileId:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->userId:I

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->filename:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->contentType:Ljava/lang/String;

    iget-wide v4, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->size:J

    iget-wide v6, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAt:D

    iget-object v8, p0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->createdAtFormatted:Ljava/lang/String;

    const-string v9, ", userId="

    const-string v10, ", filename="

    const-string v11, "AiChatImageUploadResponse(fileId="

    invoke-static {v1, v11, v0, v9, v10}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contentType="

    const-string v9, ", size="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    const-string v2, ", createdAtFormatted="

    invoke-static {v0, v1, v6, v7, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
