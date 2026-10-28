.class public final Lcom/iterable/iterableapi/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Landroid/graphics/Rect;

.field public final c:D

.field public final d:Lcom/iterable/iterableapi/g1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Rect;DLcom/iterable/iterableapi/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    iput-wide p3, p0, Lcom/iterable/iterableapi/e1;->c:D

    iput-object p5, p0, Lcom/iterable/iterableapi/e1;->d:Lcom/iterable/iterableapi/g1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/iterable/iterableapi/e1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/iterable/iterableapi/e1;

    iget-object v1, p0, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    iget-object v3, p1, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v3, p0, Lcom/iterable/iterableapi/e1;->c:D

    iget-wide v5, p1, Lcom/iterable/iterableapi/e1;->c:D

    cmpl-double p1, v3, v5

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    iget-wide v1, p0, Lcom/iterable/iterableapi/e1;->c:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-object v2, p0, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    filled-new-array {v0, v2, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
