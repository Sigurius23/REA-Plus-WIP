.class public final Llive/hms/video/error/HMSException;
.super Ljava/lang/Exception;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/events/IAnalyticsPropertiesProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u00002\u00060\u0002j\u0002`\u00012\u00020\u0003Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012$\u0008\u0002\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J)\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010H\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0008\u0010&\u001a\u00020\u0007H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR2\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR$\u0010\n\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u0018\"\u0004\u0008#\u0010$\u00a8\u0006\'"
    }
    d2 = {
        "Llive/hms/video/error/HMSException;",
        "Lkotlin/Exception;",
        "Ljava/lang/Exception;",
        "Llive/hms/video/events/IAnalyticsPropertiesProvider;",
        "code",
        "",
        "name",
        "",
        "action",
        "message",
        "description",
        "cause",
        "",
        "isTerminal",
        "",
        "params",
        "Lkotlin/collections/HashMap;",
        "",
        "Ljava/util/HashMap;",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V",
        "getCode",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "getAction",
        "getMessage",
        "()Z",
        "setTerminal",
        "(Z)V",
        "getParams$lib_release",
        "()Ljava/util/HashMap;",
        "Ljava/util/HashMap;",
        "value",
        "getDescription",
        "setDescription$lib_release",
        "(Ljava/lang/String;)V",
        "toAnalyticsProperties",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final action:Ljava/lang/String;

.field private final code:I

.field private description:Ljava/lang/String;

.field private isTerminal:Z

.field private final message:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final params:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Z",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p4, p6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    iput p1, p0, Llive/hms/video/error/HMSException;->code:I

    .line 5
    iput-object p2, p0, Llive/hms/video/error/HMSException;->name:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Llive/hms/video/error/HMSException;->action:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Llive/hms/video/error/HMSException;->message:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Llive/hms/video/error/HMSException;->isTerminal:Z

    .line 9
    iput-object p8, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    .line 10
    iput-object p5, p0, Llive/hms/video/error/HMSException;->description:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    move-object v10, v0

    :goto_2
    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    goto :goto_3

    :cond_2
    move-object/from16 v10, p8

    goto :goto_2

    .line 2
    :goto_3
    invoke-direct/range {v2 .. v10}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-void
.end method


# virtual methods
.method public final getAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/error/HMSException;->action:Ljava/lang/String;

    return-object v0
.end method

.method public final getCode()I
    .locals 1

    iget v0, p0, Llive/hms/video/error/HMSException;->code:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/error/HMSException;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/error/HMSException;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/error/HMSException;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams$lib_release()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    return-object v0
.end method

.method public final isTerminal()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/error/HMSException;->isTerminal:Z

    return v0
.end method

.method public final setDescription$lib_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/error/HMSException;->description:Ljava/lang/String;

    return-void
.end method

.method public final setTerminal(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/error/HMSException;->isTerminal:Z

    return-void
.end method

.method public toAnalyticsProperties()Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    iget v1, p0, Llive/hms/video/error/HMSException;->code:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "error_code"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    const-string v1, "error_message"

    invoke-virtual {p0}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    const-string v1, "error_description"

    iget-object v2, p0, Llive/hms/video/error/HMSException;->description:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    const-string v1, "action"

    iget-object v2, p0, Llive/hms/video/error/HMSException;->action:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    iget-boolean v1, p0, Llive/hms/video/error/HMSException;->isTerminal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "is_terminal"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/error/HMSException;->params:Ljava/util/HashMap;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/error/HMSException;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/error/HMSException;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/error/HMSException;->action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/error/HMSException;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cause="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
