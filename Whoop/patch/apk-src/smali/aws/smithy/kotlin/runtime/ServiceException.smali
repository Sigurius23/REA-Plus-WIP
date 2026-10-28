.class public Laws/smithy/kotlin/runtime/ServiceException;
.super Laws/smithy/kotlin/runtime/SdkBaseException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/ServiceException;",
        "Laws/smithy/kotlin/runtime/SdkBaseException;",
        "<init>",
        "()V",
        "te/f",
        "runtime-core"
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
.field public final x:Lte/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>()V

    .line 2
    new-instance v0, Lte/e;

    invoke-direct {v0}, Lte/e;-><init>()V

    iput-object v0, p0, Laws/smithy/kotlin/runtime/ServiceException;->x:Lte/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p2, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    new-instance p1, Lte/e;

    invoke-direct {p1}, Lte/e;-><init>()V

    iput-object p1, p0, Laws/smithy/kotlin/runtime/ServiceException;->x:Lte/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance p1, Lte/e;

    invoke-direct {p1}, Lte/e;-><init>()V

    iput-object p1, p0, Laws/smithy/kotlin/runtime/ServiceException;->x:Lte/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lte/c;
    .locals 1

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Lte/e;
    .locals 1

    iget-object v0, p0, Laws/smithy/kotlin/runtime/ServiceException;->x:Lte/e;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 9

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-super {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v1

    invoke-virtual {v1}, Lte/e;->f()Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_2

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v1

    invoke-virtual {v1}, Lte/e;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "Service returned error code "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v2

    invoke-virtual {v2}, Lte/e;->g()Lte/f;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Protocol response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v2

    invoke-virtual {v2}, Lte/e;->h()Lte/d;

    move-result-object v2

    invoke-interface {v2}, Lte/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v1

    invoke-virtual {v1}, Lte/e;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "Request ID: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v1

    invoke-virtual {v1}, Lte/c;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lte/a;

    invoke-virtual {v2}, Lte/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    const/4 v7, 0x0

    const/16 v8, 0x3f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
