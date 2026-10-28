.class public final Lic/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Lic/e;


# instance fields
.field public final a:Lic/x;

.field public final b:Lrc/e;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:J

.field public final h:J

.field public final i:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lic/e;

    invoke-direct {v0}, Lic/e;-><init>()V

    sput-object v0, Lic/e;->j:Lic/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lic/x;->w:Lic/x;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v1, Lrc/e;

    const/4 v2, 0x0

    .line 4
    invoke-direct {v1, v2}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    .line 5
    iput-object v1, p0, Lic/e;->b:Lrc/e;

    .line 6
    iput-object v0, p0, Lic/e;->a:Lic/x;

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lic/e;->c:Z

    .line 8
    iput-boolean v0, p0, Lic/e;->d:Z

    .line 9
    iput-boolean v0, p0, Lic/e;->e:Z

    .line 10
    iput-boolean v0, p0, Lic/e;->f:Z

    const-wide/16 v0, -0x1

    .line 11
    iput-wide v0, p0, Lic/e;->g:J

    .line 12
    iput-wide v0, p0, Lic/e;->h:J

    .line 13
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    iput-object v0, p0, Lic/e;->i:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lic/e;)V
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iget-boolean v0, p1, Lic/e;->c:Z

    iput-boolean v0, p0, Lic/e;->c:Z

    .line 26
    iget-boolean v0, p1, Lic/e;->d:Z

    iput-boolean v0, p0, Lic/e;->d:Z

    .line 27
    iget-object v0, p1, Lic/e;->b:Lrc/e;

    iput-object v0, p0, Lic/e;->b:Lrc/e;

    .line 28
    iget-object v0, p1, Lic/e;->a:Lic/x;

    iput-object v0, p0, Lic/e;->a:Lic/x;

    .line 29
    iget-boolean v0, p1, Lic/e;->e:Z

    iput-boolean v0, p0, Lic/e;->e:Z

    .line 30
    iget-boolean v0, p1, Lic/e;->f:Z

    iput-boolean v0, p0, Lic/e;->f:Z

    .line 31
    iget-object v0, p1, Lic/e;->i:Ljava/util/Set;

    iput-object v0, p0, Lic/e;->i:Ljava/util/Set;

    .line 32
    iget-wide v0, p1, Lic/e;->g:J

    iput-wide v0, p0, Lic/e;->g:J

    .line 33
    iget-wide v0, p1, Lic/e;->h:J

    iput-wide v0, p0, Lic/e;->h:J

    return-void
.end method

.method public constructor <init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lic/e;->b:Lrc/e;

    .line 16
    iput-object p2, p0, Lic/e;->a:Lic/x;

    .line 17
    iput-boolean p3, p0, Lic/e;->c:Z

    .line 18
    iput-boolean p4, p0, Lic/e;->d:Z

    .line 19
    iput-boolean p5, p0, Lic/e;->e:Z

    .line 20
    iput-boolean p6, p0, Lic/e;->f:Z

    .line 21
    iput-wide p7, p0, Lic/e;->g:J

    .line 22
    iput-wide p9, p0, Lic/e;->h:J

    .line 23
    iput-object p11, p0, Lic/e;->i:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()Landroid/net/NetworkRequest;
    .locals 1

    iget-object v0, p0, Lic/e;->b:Lrc/e;

    iget-object v0, v0, Lrc/e;->a:Ljava/lang/Object;

    check-cast v0, Landroid/net/NetworkRequest;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lic/e;->i:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_a

    const-class v1, Lic/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lic/e;

    iget-boolean v1, p0, Lic/e;->c:Z

    iget-boolean v2, p1, Lic/e;->c:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-boolean v1, p0, Lic/e;->d:Z

    iget-boolean v2, p1, Lic/e;->d:Z

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    iget-boolean v1, p0, Lic/e;->e:Z

    iget-boolean v2, p1, Lic/e;->e:Z

    if-eq v1, v2, :cond_4

    return v0

    :cond_4
    iget-boolean v1, p0, Lic/e;->f:Z

    iget-boolean v2, p1, Lic/e;->f:Z

    if-eq v1, v2, :cond_5

    return v0

    :cond_5
    iget-wide v1, p0, Lic/e;->g:J

    iget-wide v3, p1, Lic/e;->g:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_6

    return v0

    :cond_6
    iget-wide v1, p0, Lic/e;->h:J

    iget-wide v3, p1, Lic/e;->h:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    return v0

    :cond_7
    invoke-virtual {p0}, Lic/e;->a()Landroid/net/NetworkRequest;

    move-result-object v1

    invoke-virtual {p1}, Lic/e;->a()Landroid/net/NetworkRequest;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    iget-object v1, p0, Lic/e;->a:Lic/x;

    iget-object v2, p1, Lic/e;->a:Lic/x;

    if-eq v1, v2, :cond_9

    return v0

    :cond_9
    iget-object v0, p0, Lic/e;->i:Ljava/util/Set;

    iget-object p1, p1, Lic/e;->i:Ljava/util/Set;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_a
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lic/e;->a:Lic/x;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lic/e;->c:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lic/e;->d:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lic/e;->e:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lic/e;->f:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lic/e;->g:J

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lic/e;->h:J

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lic/e;->i:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    invoke-virtual {p0}, Lic/e;->a()Landroid/net/NetworkRequest;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Constraints{requiredNetworkType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lic/e;->a:Lic/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requiresCharging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lic/e;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requiresDeviceIdle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lic/e;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requiresBatteryNotLow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lic/e;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requiresStorageNotLow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lic/e;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", contentTriggerUpdateDelayMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lic/e;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", contentTriggerMaxDelayMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lic/e;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", contentUriTriggers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lic/e;->i:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
