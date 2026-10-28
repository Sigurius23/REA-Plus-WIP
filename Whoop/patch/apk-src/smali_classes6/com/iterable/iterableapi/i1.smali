.class public final Lcom/iterable/iterableapi/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    const/4 v0, 0x1

    .line 10
    iput v0, p0, Lcom/iterable/iterableapi/i1;->b:I

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    .line 3
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "never"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    const-string v0, "immediate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iput v1, p0, Lcom/iterable/iterableapi/i1;->b:I

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 6
    iput p1, p0, Lcom/iterable/iterableapi/i1;->b:I

    return-void

    .line 7
    :cond_1
    iput v1, p0, Lcom/iterable/iterableapi/i1;->b:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/iterable/iterableapi/i1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/iterable/iterableapi/i1;

    iget-object v0, p0, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    iget-object p1, p1, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
