.class public final Lcom/whoop/healthspan/domain/models/SingleContributorContainer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/models/SingleContributorContainer$$serializer;,
        Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J:\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010\'\u001a\u00020\u00042\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008\u0005\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008-\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008\u0008\u0010 \u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainer;",
        "",
        "",
        "titleDisplay",
        "",
        "isEnabled",
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "content",
        "isOpen",
        "<init>",
        "(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "()Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "component4",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/SingleContributorContainer;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "Z",
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "getContent",
        "Ljava/lang/Boolean;",
        "Companion",
        "$serializer",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;


# instance fields
.field private final content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

.field private final isEnabled:Z

.field private final isOpen:Ljava/lang/Boolean;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->Companion:Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/healthspan/domain/models/SingleContributorContainer$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/SingleContributorContainer$$serializer;

    invoke-virtual {p6}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/models/SingleContributorContainer;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->copy(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/SingleContributorContainer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    return v0
.end method

.method public final component3()Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/SingleContributorContainer;
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;-><init>(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getContent()Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    return v0
.end method

.method public final isOpen()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->titleDisplay:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isEnabled:Z

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->content:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainer;->isOpen:Ljava/lang/Boolean;

    const-string v4, ", isEnabled="

    const-string v5, ", content="

    const-string v6, "SingleContributorContainer(titleDisplay="

    invoke-static {v6, v0, v4, v5, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isOpen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
