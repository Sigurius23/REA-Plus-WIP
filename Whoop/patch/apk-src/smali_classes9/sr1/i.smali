.class public final Lsr1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010 \u001a\u0004\u0008\u001c\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lsr1/i;",
        "",
        "Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "widget",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "",
        "autoSaveEnabled",
        "",
        "bottomButtonText",
        "autoSaveInstructionText",
        "<init>",
        "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "e",
        "()Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "b",
        "Lcom/whoop/navigation/AiAction;",
        "()Lcom/whoop/navigation/AiAction;",
        "c",
        "Z",
        "()Z",
        "d",
        "Ljava/lang/String;",
        "journal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:I


# instance fields
.field private final a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

.field private final b:Lcom/whoop/navigation/AiAction;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/AiAction;->$stable:I

    sget v1, Lcom/whoop/design/models/items/AiChatTalkTextModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lsr1/i;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    iput-object p2, p0, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    iput-boolean p3, p0, Lsr1/i;->c:Z

    iput-object p4, p0, Lsr1/i;->d:Ljava/lang/String;

    iput-object p5, p0, Lsr1/i;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lsr1/i;->c:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsr1/i;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsr1/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/models/items/AiChatTalkTextModel;
    .locals 1

    iget-object v0, p0, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsr1/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsr1/i;

    iget-object v1, p0, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    iget-object v3, p1, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    iget-object v3, p1, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lsr1/i;->c:Z

    iget-boolean v3, p1, Lsr1/i;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsr1/i;->d:Ljava/lang/String;

    iget-object v3, p1, Lsr1/i;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lsr1/i;->e:Ljava/lang/String;

    iget-object p1, p1, Lsr1/i;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lsr1/i;->c:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lsr1/i;->d:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lsr1/i;->e:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lsr1/i;->a:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    iget-object v1, p0, Lsr1/i;->b:Lcom/whoop/navigation/AiAction;

    iget-boolean v2, p0, Lsr1/i;->c:Z

    iget-object v3, p0, Lsr1/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lsr1/i;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "TalkTextWidgetDomainState(widget="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiAction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoSaveEnabled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomButtonText="

    const-string v1, ", autoSaveInstructionText="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
