.class public final Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$$serializer;,
        Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0002\'&B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010$\u001a\u0004\u0008%\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;",
        "",
        "",
        "",
        "allowedLanguages",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponse;",
        "toAllowedLanguageResponse",
        "()Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponse;",
        "component1",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/util/List;)Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getAllowedLanguages",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$Companion;


# instance fields
.field private final allowedLanguages:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "allowed_languages"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->Companion:Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, La13/f;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, La13/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ll83/h;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$$serializer;

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "allowedLanguages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->copy(Ljava/util/List;)Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;"
        }
    .end annotation

    const-string v0, "allowedLanguages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;

    invoke-direct {v0, p1}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAllowedLanguages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toAllowedLanguageResponse()Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponse;
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponse;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->allowedLanguages:Ljava/util/List;

    const-string v1, "AllowedLanguagesResponseDto(allowedLanguages="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
