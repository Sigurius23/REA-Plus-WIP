.class public final Lvg0/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0081\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001d\u001a\u0004\u0008\u0015\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0019\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lvg0/y0;",
        "",
        "",
        "fingerprint",
        "turnId",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "feedbackType",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "feedback",
        "",
        "showToast",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Z)V",
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
        "b",
        "d",
        "c",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "getFeedbackType",
        "()Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "e",
        "Z",
        "()Z",
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


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

.field private final d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Z)V
    .locals 1

    const-string v0, "fingerprint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg0/y0;->a:Ljava/lang/String;

    iput-object p2, p0, Lvg0/y0;->b:Ljava/lang/String;

    iput-object p3, p0, Lvg0/y0;->c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iput-object p4, p0, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iput-boolean p5, p0, Lvg0/y0;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;
    .locals 1

    iget-object v0, p0, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvg0/y0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lvg0/y0;->e:Z

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvg0/y0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvg0/y0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvg0/y0;

    iget-object v1, p0, Lvg0/y0;->a:Ljava/lang/String;

    iget-object v3, p1, Lvg0/y0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvg0/y0;->b:Ljava/lang/String;

    iget-object v3, p1, Lvg0/y0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvg0/y0;->c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v3, p1, Lvg0/y0;->c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-object v3, p1, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lvg0/y0;->e:Z

    iget-boolean p1, p1, Lvg0/y0;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lvg0/y0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lvg0/y0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lvg0/y0;->c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lvg0/y0;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lvg0/y0;->a:Ljava/lang/String;

    iget-object v1, p0, Lvg0/y0;->b:Ljava/lang/String;

    iget-object v2, p0, Lvg0/y0;->c:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v3, p0, Lvg0/y0;->d:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-boolean v4, p0, Lvg0/y0;->e:Z

    const-string v5, ", turnId="

    const-string v6, ", feedbackType="

    const-string v7, "SubmitTurnFeedbackAction(fingerprint="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", feedback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showToast="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
