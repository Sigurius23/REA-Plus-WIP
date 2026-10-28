.class public final Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\u000c\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004H\u00d6\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;",
        "",
        "languagePreferences",
        "",
        "",
        "<init>",
        "(Ljava/util/List;)V",
        "getLanguagePreferences",
        "()Ljava/util/List;",
        "toLanguagePreferencesResolutionResponse",
        "Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final languagePreferences:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "language_preferences"
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
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->copy(Ljava/util/List;)Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;

    move-result-object p0

    return-object p0
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

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;

    invoke-direct {v0, p1}, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLanguagePreferences()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toLanguagePreferencesResolutionResponse()Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;->languagePreferences:Ljava/util/List;

    const-string v1, "LanguagePreferencesResolutionResponseDto(languagePreferences="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
