.class public final Lzg0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzg0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 \'2\u00020\u0001:\u0001\u0018BK\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0011R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008\u0018\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001b\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008!\u0010\u0011R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008$\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lzg0/e;",
        "",
        "",
        "turnId",
        "",
        "Lzg0/d;",
        "messages",
        "",
        "feedbackEnabled",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "feedbackType",
        "rawTextContent",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "turnStatus",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;ZLcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "e",
        "b",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "Z",
        "()Z",
        "d",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "()Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "f",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "()Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "g",
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


# static fields
.field public static final g:Lzg0/e$a;

.field public static final h:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzg0/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/whoop/bot/models/conversation/AiMessageStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzg0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzg0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzg0/e;->g:Lzg0/e$a;

    const/16 v0, 0x8

    sput v0, Lzg0/e;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ZLcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lzg0/d;",
            ">;Z",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
            ")V"
        }
    .end annotation

    const-string v0, "turnId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawTextContent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnStatus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzg0/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lzg0/e;->b:Ljava/util/List;

    iput-boolean p3, p0, Lzg0/e;->c:Z

    iput-object p4, p0, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iput-object p5, p0, Lzg0/e;->e:Ljava/lang/String;

    iput-object p6, p0, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lzg0/e;->c:Z

    return v0
.end method

.method public final b()Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    iget-object v0, p0, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzg0/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg0/e;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzg0/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzg0/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzg0/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzg0/e;

    iget-object v1, p0, Lzg0/e;->a:Ljava/lang/String;

    iget-object v3, p1, Lzg0/e;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzg0/e;->b:Ljava/util/List;

    iget-object v3, p1, Lzg0/e;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lzg0/e;->c:Z

    iget-boolean v3, p1, Lzg0/e;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v3, p1, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lzg0/e;->e:Ljava/lang/String;

    iget-object v3, p1, Lzg0/e;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    iget-object p1, p1, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    iget-object v0, p0, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lzg0/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzg0/e;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lzg0/e;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzg0/e;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lzg0/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lzg0/e;->b:Ljava/util/List;

    iget-boolean v2, p0, Lzg0/e;->c:Z

    iget-object v3, p0, Lzg0/e;->d:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v4, p0, Lzg0/e;->e:Ljava/lang/String;

    iget-object v5, p0, Lzg0/e;->f:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v6, ", messages="

    const-string v7, ", feedbackEnabled="

    const-string v8, "AiChatSectionViewState(turnId="

    invoke-static {v8, v0, v6, v7, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", feedbackType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawTextContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", turnStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
