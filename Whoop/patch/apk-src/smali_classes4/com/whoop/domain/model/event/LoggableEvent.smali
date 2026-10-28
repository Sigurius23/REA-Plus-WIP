.class public Lcom/whoop/domain/model/event/LoggableEvent;
.super Lqr2/a;
.source "SourceFile"


# instance fields
.field public final level:I

.field public final message:Ljava/lang/String;

.field public final messageTag:Ljava/lang/String;

.field public final throwable:Ljava/lang/Throwable;


# direct methods
.method public varargs constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;J[Lqr2/a$a;)V
    .locals 0

    invoke-direct {p0, p5, p6, p7}, Lqr2/a;-><init>(J[Lqr2/a$a;)V

    iput p1, p0, Lcom/whoop/domain/model/event/LoggableEvent;->level:I

    iput-object p2, p0, Lcom/whoop/domain/model/event/LoggableEvent;->messageTag:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/domain/model/event/LoggableEvent;->message:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/domain/model/event/LoggableEvent;->throwable:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/whoop/domain/model/event/LoggableEvent;->level:I

    invoke-static {v1}, Ltr2/i;->a(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/domain/model/event/LoggableEvent;->messageTag:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/domain/model/event/LoggableEvent;->messageTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/domain/model/event/LoggableEvent;->message:Ljava/lang/String;

    const-string v2, "\n"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
