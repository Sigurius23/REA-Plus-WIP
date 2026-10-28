.class public final Lv33/n;
.super Lv33/w;
.source "SourceFile"


# instance fields
.field public final a:Lstream/video/sfu/models/CallState;

.field public final b:Lv33/o;

.field public final c:I

.field public final d:Z

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lstream/video/sfu/models/CallState;Lv33/o;IZLjava/util/List;)V
    .locals 1

    const-string v0, "publishOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    iput-object p1, p0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    iput-object p2, p0, Lv33/n;->b:Lv33/o;

    iput p3, p0, Lv33/n;->c:I

    iput-boolean p4, p0, Lv33/n;->d:Z

    iput-object p5, p0, Lv33/n;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv33/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv33/n;

    iget-object v1, p0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    iget-object v3, p1, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv33/n;->b:Lv33/o;

    iget-object v3, p1, Lv33/n;->b:Lv33/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lv33/n;->c:I

    iget v3, p1, Lv33/n;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lv33/n;->d:Z

    iget-boolean v3, p1, Lv33/n;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lv33/n;->e:Ljava/util/List;

    iget-object p1, p1, Lv33/n;->e:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-virtual {v0}, Lstream/video/sfu/models/CallState;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv33/n;->b:Lv33/o;

    invoke-virtual {v2}, Lv33/o;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lv33/n;->c:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lv33/n;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lv33/n;->e:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JoinCallResponseEvent(callState="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", participantCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv33/n;->b:Lv33/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fastReconnectDeadlineSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isReconnected="

    const-string v2, ", publishOptions="

    iget v3, p0, Lv33/n;->c:I

    iget-boolean v4, p0, Lv33/n;->d:Z

    invoke-static {v3, v1, v2, v0, v4}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ")"

    iget-object v2, p0, Lv33/n;->e:Ljava/util/List;

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
