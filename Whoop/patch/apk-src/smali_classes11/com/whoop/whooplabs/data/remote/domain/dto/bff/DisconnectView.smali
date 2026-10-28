.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0093\u0001\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0017J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0017J\u0088\u0001\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00089\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u0008:\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u0008;\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u0008<\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u0008=\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u0008>\u0010\u0017R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u0008?\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00105\u001a\u0004\u0008@\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00105\u001a\u0004\u0008A\u0010\u0017\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;",
        "",
        "",
        "title",
        "body",
        "positiveCta",
        "negativeCta",
        "errorTitle",
        "errorBody",
        "errorPositiveCta",
        "errorNegativeCta",
        "submittingTitle",
        "submittingBody",
        "successText",
        "successSubtext",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getBody",
        "getPositiveCta",
        "getNegativeCta",
        "getErrorTitle",
        "getErrorBody",
        "getErrorPositiveCta",
        "getErrorNegativeCta",
        "getSubmittingTitle",
        "getSubmittingBody",
        "getSuccessText",
        "getSuccessSubtext",
        "Companion",
        "$serializer",
        "whooplabs_release"
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

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;


# instance fields
.field private final body:Ljava/lang/String;

.field private final errorBody:Ljava/lang/String;

.field private final errorNegativeCta:Ljava/lang/String;

.field private final errorPositiveCta:Ljava/lang/String;

.field private final errorTitle:Ljava/lang/String;

.field private final negativeCta:Ljava/lang/String;

.field private final positiveCta:Ljava/lang/String;

.field private final submittingBody:Ljava/lang/String;

.field private final submittingTitle:Ljava/lang/String;

.field private final successSubtext:Ljava/lang/String;

.field private final successText:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;

    invoke-virtual {p14}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "positiveCta"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "negativeCta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorBody"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorPositiveCta"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorNegativeCta"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingTitle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingBody"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successText"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successSubtext"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xb

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;
    .locals 14

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "positiveCta"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "negativeCta"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorTitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorBody"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorPositiveCta"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorNegativeCta"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingTitle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingBody"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successText"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successSubtext"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    move-object v2, p1

    invoke-direct/range {v1 .. v13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittingBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittingTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->body:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->positiveCta:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->negativeCta:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorBody:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorPositiveCta:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->errorNegativeCta:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingTitle:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->submittingBody:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successText:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;->successSubtext:Ljava/lang/String;

    const-string v12, ", body="

    const-string v13, ", positiveCta="

    const-string v14, "DisconnectView(title="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", negativeCta="

    const-string v12, ", errorTitle="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", errorBody="

    const-string v2, ", errorPositiveCta="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", errorNegativeCta="

    const-string v2, ", submittingTitle="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submittingBody="

    const-string v2, ", successText="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", successSubtext="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
