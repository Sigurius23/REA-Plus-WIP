.class public final Lsr1/a$b;
.super Lsr1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsr1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0018\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lsr1/a$b;",
        "Lsr1/a;",
        "",
        "min",
        "max",
        "value",
        "",
        "unit",
        "<init>",
        "(DDDLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "D",
        "b",
        "()D",
        "c",
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


# instance fields
.field private final a:D

.field private final b:D

.field private final c:D

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(DDDLjava/lang/String;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lsr1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-wide p1, p0, Lsr1/a$b;->a:D

    iput-wide p3, p0, Lsr1/a$b;->b:D

    iput-wide p5, p0, Lsr1/a$b;->c:D

    iput-object p7, p0, Lsr1/a$b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    iget-wide v0, p0, Lsr1/a$b;->b:D

    return-wide v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Lsr1/a$b;->a:D

    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsr1/a$b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()D
    .locals 2

    iget-wide v0, p0, Lsr1/a$b;->c:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsr1/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsr1/a$b;

    iget-wide v3, p0, Lsr1/a$b;->a:D

    iget-wide v5, p1, Lsr1/a$b;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lsr1/a$b;->b:D

    iget-wide v5, p1, Lsr1/a$b;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lsr1/a$b;->c:D

    iget-wide v5, p1, Lsr1/a$b;->c:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsr1/a$b;->d:Ljava/lang/String;

    iget-object p1, p1, Lsr1/a$b;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lsr1/a$b;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lsr1/a$b;->b:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lsr1/a$b;->c:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lsr1/a$b;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lsr1/a$b;->a:D

    iget-wide v2, p0, Lsr1/a$b;->b:D

    iget-wide v4, p0, Lsr1/a$b;->c:D

    iget-object v6, p0, Lsr1/a$b;->d:Ljava/lang/String;

    const-string v7, "Magnitude(min="

    const-string v8, ", max="

    invoke-static {v7, v0, v1, v8}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    const-string v2, ", unit="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
