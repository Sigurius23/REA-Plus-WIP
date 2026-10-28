.class public final Lcom/whoop/bot/models/conversation/ImageUploadResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/ImageUploadResponse$$serializer;,
        Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0081\u0008\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJL\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u00080\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010+\u001a\u0004\u00083\u0010\u001b\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/ImageUploadResponse;",
        "",
        "",
        "id",
        "",
        "userId",
        "filename",
        "contentType",
        "",
        "size",
        "createdAt",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/ImageUploadResponse;Lzc3/c;Lyc3/g;)V",
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
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/whoop/bot/models/conversation/ImageUploadResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "I",
        "getUserId",
        "getFilename",
        "getContentType",
        "J",
        "getSize",
        "getCreatedAt",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;


# instance fields
.field private final contentType:Ljava/lang/String;

.field private final createdAt:Ljava/lang/String;

.field private final filename:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final size:J

.field private final userId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->Companion:Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/bot/models/conversation/ImageUploadResponse$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ImageUploadResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/bot/models/conversation/ImageUploadResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    iput-wide p6, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    iput-object p8, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    .line 8
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/ImageUploadResponse;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/ImageUploadResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-wide p5, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    :cond_5
    move-object p9, p7

    move-wide p7, p5

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/ImageUploadResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/whoop/bot/models/conversation/ImageUploadResponse;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-direct/range {v1 .. v8}, Lcom/whoop/bot/models/conversation/ImageUploadResponse;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    iget v3, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    iget-wide v5, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    return-wide v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->id:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->userId:I

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->filename:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->contentType:Ljava/lang/String;

    iget-wide v4, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->size:J

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/ImageUploadResponse;->createdAt:Ljava/lang/String;

    const-string v7, ", userId="

    const-string v8, ", filename="

    const-string v9, "ImageUploadResponse(id="

    invoke-static {v1, v9, v0, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contentType="

    const-string v7, ", size="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
