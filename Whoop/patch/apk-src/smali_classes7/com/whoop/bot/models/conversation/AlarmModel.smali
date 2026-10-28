.class public final Lcom/whoop/bot/models/conversation/AlarmModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;,
        Lcom/whoop/bot/models/conversation/AlarmModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 \'2\u00020\u0001:\u0002(\'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B-\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010%\u001a\u0004\u0008&\u0010\u0019\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/AlarmModel;",
        "",
        "",
        "isEnabled",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "<init>",
        "(ZLcom/whoop/design/util/TextResource;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/AlarmModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "copy",
        "(ZLcom/whoop/design/util/TextResource;)Lcom/whoop/bot/models/conversation/AlarmModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "Lcom/whoop/design/util/TextResource;",
        "getLabel",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/AlarmModel$Companion;


# instance fields
.field private final isEnabled:Z

.field private final label:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/AlarmModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/AlarmModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AlarmModel;->Companion:Lcom/whoop/bot/models/conversation/AlarmModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/bot/models/conversation/AlarmModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;

    invoke-virtual {p4}, Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public constructor <init>(ZLcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/AlarmModel;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/AlarmModel;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/models/conversation/AlarmModel;->copy(ZLcom/whoop/design/util/TextResource;)Lcom/whoop/bot/models/conversation/AlarmModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/AlarmModel;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    return v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(ZLcom/whoop/design/util/TextResource;)Lcom/whoop/bot/models/conversation/AlarmModel;
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/AlarmModel;

    invoke-direct {v0, p1, p2}, Lcom/whoop/bot/models/conversation/AlarmModel;-><init>(ZLcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/AlarmModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/AlarmModel;

    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLabel()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled:Z

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AlarmModel;->label:Lcom/whoop/design/util/TextResource;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AlarmModel(isEnabled="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
