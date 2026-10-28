.class public final Lcom/whoop/design/models/binding/AggregateEvaluation$Update;
.super Lcom/whoop/design/models/binding/AggregateEvaluation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/binding/AggregateEvaluation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Update"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00d6\u0083\u0004J\n\u0010\r\u001a\u00020\u000eH\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/models/binding/AggregateEvaluation$Update;",
        "Lcom/whoop/design/models/binding/AggregateEvaluation;",
        "value",
        "",
        "<init>",
        "(Ljava/lang/Object;)V",
        "getValue",
        "()Ljava/lang/Object;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "state-binding-annotations"
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
.field private final value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/design/models/binding/AggregateEvaluation;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/binding/AggregateEvaluation$Update;Ljava/lang/Object;ILjava/lang/Object;)Lcom/whoop/design/models/binding/AggregateEvaluation$Update;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->copy(Ljava/lang/Object;)Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(Ljava/lang/Object;)Lcom/whoop/design/models/binding/AggregateEvaluation$Update;
    .locals 1

    new-instance v0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {v0, p1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    iget-object v1, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    iget-object p1, p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->value:Ljava/lang/Object;

    const-string v1, "Update(value="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
