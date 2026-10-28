.class public final Lzk/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/e;


# static fields
.field public static final j:Ltl/h;


# instance fields
.field public final b:Lal/g;

.field public final c:Lwk/e;

.field public final d:Lwk/e;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;

.field public final h:Lwk/h;

.field public final i:Lwk/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltl/h;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, Ltl/h;-><init>(J)V

    sput-object v0, Lzk/b0;->j:Ltl/h;

    return-void
.end method

.method public constructor <init>(Lal/g;Lwk/e;Lwk/e;IILwk/l;Ljava/lang/Class;Lwk/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk/b0;->b:Lal/g;

    iput-object p2, p0, Lzk/b0;->c:Lwk/e;

    iput-object p3, p0, Lzk/b0;->d:Lwk/e;

    iput p4, p0, Lzk/b0;->e:I

    iput p5, p0, Lzk/b0;->f:I

    iput-object p6, p0, Lzk/b0;->i:Lwk/l;

    iput-object p7, p0, Lzk/b0;->g:Ljava/lang/Class;

    iput-object p8, p0, Lzk/b0;->h:Lwk/h;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 5

    iget-object v0, p0, Lzk/b0;->b:Lal/g;

    const-class v1, [B

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lal/g;->b:Lal/f;

    iget-object v3, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lal/i;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lal/f;->H0()Lal/i;

    move-result-object v3

    :cond_0
    check-cast v3, Lal/e;

    const/16 v2, 0x8

    invoke-virtual {v3, v2, v1}, Lal/e;->b(ILjava/lang/Class;)V

    invoke-virtual {v0, v3, v1}, Lal/g;->e(Lal/e;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    check-cast v1, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, Lzk/b0;->e:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, Lzk/b0;->f:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    iget-object v0, p0, Lzk/b0;->d:Lwk/e;

    invoke-interface {v0, p1}, Lwk/e;->a(Ljava/security/MessageDigest;)V

    iget-object v0, p0, Lzk/b0;->c:Lwk/e;

    invoke-interface {v0, p1}, Lwk/e;->a(Ljava/security/MessageDigest;)V

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    iget-object v0, p0, Lzk/b0;->i:Lwk/l;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lwk/e;->a(Ljava/security/MessageDigest;)V

    :cond_1
    iget-object v0, p0, Lzk/b0;->h:Lwk/h;

    invoke-virtual {v0, p1}, Lwk/h;->a(Ljava/security/MessageDigest;)V

    sget-object v0, Lzk/b0;->j:Ltl/h;

    iget-object v2, p0, Lzk/b0;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ltl/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lwk/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ltl/h;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v3}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Lzk/b0;->b:Lal/g;

    invoke-virtual {p1, v1}, Lal/g;->g(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lzk/b0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lzk/b0;

    iget v0, p0, Lzk/b0;->f:I

    iget v2, p1, Lzk/b0;->f:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lzk/b0;->e:I

    iget v2, p1, Lzk/b0;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lzk/b0;->i:Lwk/l;

    iget-object v2, p1, Lzk/b0;->i:Lwk/l;

    invoke-static {v0, v2}, Ltl/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/b0;->g:Ljava/lang/Class;

    iget-object v2, p1, Lzk/b0;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/b0;->c:Lwk/e;

    iget-object v2, p1, Lzk/b0;->c:Lwk/e;

    invoke-interface {v0, v2}, Lwk/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/b0;->d:Lwk/e;

    iget-object v2, p1, Lzk/b0;->d:Lwk/e;

    invoke-interface {v0, v2}, Lwk/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/b0;->h:Lwk/h;

    iget-object p1, p1, Lzk/b0;->h:Lwk/h;

    invoke-virtual {v0, p1}, Lwk/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lzk/b0;->c:Lwk/e;

    invoke-interface {v0}, Lwk/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lzk/b0;->d:Lwk/e;

    invoke-interface {v1}, Lwk/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lzk/b0;->e:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lzk/b0;->f:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lzk/b0;->i:Lwk/l;

    if-eqz v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lzk/b0;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lzk/b0;->h:Lwk/h;

    iget-object v1, v1, Lwk/h;->b:Ltl/b;

    invoke-virtual {v1}, Ltl/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lzk/b0;->c:Lwk/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzk/b0;->d:Lwk/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzk/b0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzk/b0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzk/b0;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzk/b0;->i:Lwk/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzk/b0;->h:Lwk/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
