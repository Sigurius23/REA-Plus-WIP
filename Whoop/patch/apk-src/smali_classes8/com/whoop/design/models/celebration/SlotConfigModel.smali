.class public final Lcom/whoop/design/models/celebration/SlotConfigModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/SlotConfigModel;",
        "",
        "name",
        "",
        "mode",
        "Lcom/whoop/design/models/celebration/SlotModeModel;",
        "options",
        "Lcom/whoop/design/models/celebration/SlotOptionsModel;",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)V",
        "getName",
        "()Ljava/lang/String;",
        "getMode",
        "()Lcom/whoop/design/models/celebration/SlotModeModel;",
        "getOptions",
        "()Lcom/whoop/design/models/celebration/SlotOptionsModel;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
        "design-models_release"
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
    with = Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;


# instance fields
.field private final mode:Lcom/whoop/design/models/celebration/SlotModeModel;

.field private final name:Ljava/lang/String;

.field private final options:Lcom/whoop/design/models/celebration/SlotOptionsModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/SlotConfigModel;->Companion:Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    iput-object p3, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/SlotConfigModel;Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/SlotConfigModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/models/celebration/SlotConfigModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)Lcom/whoop/design/models/celebration/SlotConfigModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/celebration/SlotModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/celebration/SlotOptionsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)Lcom/whoop/design/models/celebration/SlotConfigModel;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/celebration/SlotConfigModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/design/models/celebration/SlotConfigModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/SlotConfigModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/SlotConfigModel;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMode()Lcom/whoop/design/models/celebration/SlotModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Lcom/whoop/design/models/celebration/SlotOptionsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->mode:Lcom/whoop/design/models/celebration/SlotModeModel;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/SlotConfigModel;->options:Lcom/whoop/design/models/celebration/SlotOptionsModel;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SlotConfigModel(name="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
