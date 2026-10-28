.class public final Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$$serializer;,
        Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287BL\u0012\u001b\u0008\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBK\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JU\u0010&\u001a\u00020\u00002\u001b\u0008\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010!J\u0010\u0010)\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020\u000c2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00083\u0010!R\u0017\u0010\u000b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00101\u001a\u0004\u00084\u0010!R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00105\u001a\u0004\u00086\u0010%\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Ljava/util/UUID;",
        "Lcom/whoop/design/json/serializers/SerializableUUID;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "id",
        "",
        "leftIcon",
        "title",
        "confirmationMessage",
        "",
        "completed",
        "<init>",
        "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/UUID;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Z",
        "copy",
        "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/UUID;",
        "getId",
        "Ljava/lang/String;",
        "getLeftIcon",
        "getTitle",
        "getConfirmationMessage",
        "Z",
        "getCompleted",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;


# instance fields
.field private final completed:Z

.field private final confirmationMessage:Ljava/lang/String;

.field private final id:Ljava/util/UUID;

.field private final leftIcon:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->Companion:Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    const-string p7, "randomUUID(...)"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    and-int/lit8 p2, p1, 0x2

    const-string p7, ""

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    return-void

    :cond_4
    iput-boolean p6, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    .line 7
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    .line 10
    iput-boolean p5, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 11
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    const-string p7, "randomUUID(...)"

    invoke-static {p1, p7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    .line 12
    const-string p7, ""

    if-eqz p1, :cond_1

    move-object v2, p7

    goto :goto_0

    :cond_1
    move-object v2, p2

    :goto_0
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v3, p7

    goto :goto_1

    :cond_2
    move-object v3, p3

    :goto_1
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v4, p7

    goto :goto_2

    :cond_3
    move-object v4, p4

    :goto_2
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v0, p0

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->copy(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Lo91/g;->a:Lo91/g;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    if-eqz v1, :cond_9

    :goto_4
    iget-boolean p0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    return v0
.end method

.method public final copy(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    iget-boolean p1, p1, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    return v0
.end method

.method public final getConfirmationMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->id:Ljava/util/UUID;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->leftIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->confirmationMessage:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->completed:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MxmCreateCaseTileModel(id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leftIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmationMessage="

    const-string v1, ", completed="

    invoke-static {v5, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
