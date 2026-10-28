.class public final Lcom/whoop/settings/referafriend/model/ShareSheetContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/referafriend/model/ShareSheetContent$$serializer;,
        Lcom/whoop/settings/referafriend/model/ShareSheetContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010\u0015\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/settings/referafriend/model/ShareSheetContent;",
        "",
        "",
        "messageText",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$settings_release",
        "(Lcom/whoop/settings/referafriend/model/ShareSheetContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lcom/whoop/settings/referafriend/model/ShareSheetContent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getMessageText",
        "Companion",
        "$serializer",
        "settings_release"
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

.field public static final Companion:Lcom/whoop/settings/referafriend/model/ShareSheetContent$Companion;


# instance fields
.field private final messageText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "message_text"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/settings/referafriend/model/ShareSheetContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/settings/referafriend/model/ShareSheetContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->Companion:Lcom/whoop/settings/referafriend/model/ShareSheetContent$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/settings/referafriend/model/ShareSheetContent$$serializer;->INSTANCE:Lcom/whoop/settings/referafriend/model/ShareSheetContent$$serializer;

    invoke-virtual {p3}, Lcom/whoop/settings/referafriend/model/ShareSheetContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/settings/referafriend/model/ShareSheetContent;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/settings/referafriend/model/ShareSheetContent;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->copy(Ljava/lang/String;)Lcom/whoop/settings/referafriend/model/ShareSheetContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$settings_release(Lcom/whoop/settings/referafriend/model/ShareSheetContent;Lzc3/c;Lyc3/g;)V
    .locals 1

    const/4 v0, 0x0

    iget-object p0, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/whoop/settings/referafriend/model/ShareSheetContent;
    .locals 1

    const-string v0, "messageText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;

    invoke-direct {v0, p1}, Lcom/whoop/settings/referafriend/model/ShareSheetContent;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/settings/referafriend/model/ShareSheetContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/settings/referafriend/model/ShareSheetContent;

    iget-object v1, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMessageText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->messageText:Ljava/lang/String;

    const-string v1, "ShareSheetContent(messageText="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
