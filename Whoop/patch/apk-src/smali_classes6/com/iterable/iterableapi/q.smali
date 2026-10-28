.class public final Lcom/iterable/iterableapi/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(IIIJLjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p6, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    .line 7
    iput p1, p0, Lcom/iterable/iterableapi/q;->c:I

    .line 8
    iput p2, p0, Lcom/iterable/iterableapi/q;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/iterable/iterableapi/q;->b:I

    iput p2, p0, Lcom/iterable/iterableapi/q;->c:I

    iput-object p3, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lcom/iterable/iterableapi/q;->b:I

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 5

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/2addr v0, p1

    iget p1, p0, Lcom/iterable/iterableapi/q;->b:I

    if-gt v0, p1, :cond_0

    iput v0, p0, Lcom/iterable/iterableapi/q;->c:I

    return-void

    :cond_0
    const-string v0, "Unexpected end-of-doc while "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v0, v0, -0x3

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v2, v2, 0x3

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object v2, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const-string v3, "substring(...)"

    invoke-static {p1, v2, v1, v0, v3}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Llg/e;->a:Lyb3/p;

    const-string v3, "\u00b7"

    invoke-virtual {v2, v1, v3}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v2, v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " "

    invoke-static {v2, v4}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "At offset "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " (showing range "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "):\n"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {p2, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    iget-object v1, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v0, p1, v2}, Lyb3/y;->N(Ljava/lang/String;ILjava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/iterable/iterableapi/q;->c:I

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method

.method public c(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/iterable/iterableapi/q;->b:I

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/iterable/iterableapi/q;->g(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/String;)C
    .locals 6

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget v3, p0, Lcom/iterable/iterableapi/q;->b:I

    if-gt v1, v3, :cond_0

    iput v1, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_0
    const-string v0, "Unexpected end-of-doc while "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v0, v0, -0x3

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v3, v1

    iget v4, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v4, v4, 0x3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    const-string v4, "substring(...)"

    invoke-static {v3, v2, v1, v0, v4}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Llg/e;->a:Lyb3/p;

    const-string v4, "\u00b7"

    invoke-virtual {v2, v1, v4}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v2, v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " "

    invoke-static {v2, v5}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5e

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "At offset "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " (showing range "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "):\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, p1, v0, v3, v1}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/iterable/iterableapi/q;->g(I)Ljava/lang/String;

    move-result-object p2

    iput p1, p0, Lcom/iterable/iterableapi/q;->c:I

    return-object p2

    :cond_0
    const-string p1, "Unexpected end-of-doc while "

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget p2, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 p2, p2, -0x3

    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    iget v0, p0, Lcom/iterable/iterableapi/q;->b:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget v3, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v3, v3, 0x3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    const-string v3, "substring(...)"

    invoke-static {v0, v2, v1, p2, v3}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Llg/e;->a:Lyb3/p;

    const-string v3, "\u00b7"

    invoke-virtual {v2, v1, v3}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v2, p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " "

    invoke-static {v2, v4}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "At offset "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " (showing range "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2d

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "):\n"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p1, v0}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {p2, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public f(Ljava/lang/String;)V
    .locals 6

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v1, v0, -0x1

    const/4 v2, 0x1

    iget v3, p0, Lcom/iterable/iterableapi/q;->b:I

    if-gt v1, v3, :cond_0

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/iterable/iterableapi/q;->c:I

    return-void

    :cond_0
    const-string v0, "Unexpected end-of-doc while "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v0, v0, -0x3

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v3, v2

    iget v1, p0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v1, v1, 0x3

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v3, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const-string v4, "substring(...)"

    invoke-static {v1, v3, v2, v0, v4}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Llg/e;->a:Lyb3/p;

    const-string v4, "\u00b7"

    invoke-virtual {v3, v2, v4}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v3, v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " "

    invoke-static {v3, v5}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5e

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "At offset "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " (showing range "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "):\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget v1, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public h()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "campaignId"

    iget v2, p0, Lcom/iterable/iterableapi/q;->b:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "templateId"

    iget v2, p0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "messageId"

    iget-object v2, p0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method
