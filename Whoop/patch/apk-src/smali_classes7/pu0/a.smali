.class public final Lpu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0019\u001a\u0004\u0008\u001e\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0019\u001a\u0004\u0008\u001b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0019\u001a\u0004\u0008\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lpu0/a;",
        "",
        "",
        "batterySerial",
        "",
        "hardwareFamily",
        "pcbaRevision",
        "opticalRevision",
        "firmwareMajor",
        "firmwareMinor",
        "firmwarePoint",
        "firmwareExtra",
        "<init>",
        "(Ljava/lang/String;IIIIIII)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "I",
        "f",
        "c",
        "h",
        "d",
        "g",
        "e",
        "connectivity-data-packets-model_release"
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

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIIIII)V
    .locals 1

    const-string v0, "batterySerial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu0/a;->a:Ljava/lang/String;

    iput p2, p0, Lpu0/a;->b:I

    iput p3, p0, Lpu0/a;->c:I

    iput p4, p0, Lpu0/a;->d:I

    iput p5, p0, Lpu0/a;->e:I

    iput p6, p0, Lpu0/a;->f:I

    iput p7, p0, Lpu0/a;->g:I

    iput p8, p0, Lpu0/a;->h:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpu0/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lpu0/a;->h:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lpu0/a;->e:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lpu0/a;->f:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lpu0/a;->g:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpu0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpu0/a;

    iget-object v1, p0, Lpu0/a;->a:Ljava/lang/String;

    iget-object v3, p1, Lpu0/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpu0/a;->b:I

    iget v3, p1, Lpu0/a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpu0/a;->c:I

    iget v3, p1, Lpu0/a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpu0/a;->d:I

    iget v3, p1, Lpu0/a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpu0/a;->e:I

    iget v3, p1, Lpu0/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpu0/a;->f:I

    iget v3, p1, Lpu0/a;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpu0/a;->g:I

    iget v3, p1, Lpu0/a;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpu0/a;->h:I

    iget p1, p1, Lpu0/a;->h:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lpu0/a;->b:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lpu0/a;->d:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lpu0/a;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpu0/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lpu0/a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lpu0/a;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lpu0/a;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lpu0/a;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lpu0/a;->f:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lpu0/a;->g:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lpu0/a;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lpu0/a;->a:Ljava/lang/String;

    iget v1, p0, Lpu0/a;->b:I

    iget v2, p0, Lpu0/a;->c:I

    iget v3, p0, Lpu0/a;->d:I

    iget v4, p0, Lpu0/a;->e:I

    iget v5, p0, Lpu0/a;->f:I

    iget v6, p0, Lpu0/a;->g:I

    iget v7, p0, Lpu0/a;->h:I

    const-string v8, ", hardwareFamily="

    const-string v9, ", pcbaRevision="

    const-string v10, "BatteryMetaData(batterySerial="

    invoke-static {v1, v10, v0, v8, v9}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", opticalRevision="

    const-string v8, ", firmwareMajor="

    invoke-static {v0, v2, v1, v3, v8}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", firmwareMinor="

    const-string v2, ", firmwarePoint="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", firmwareExtra="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
