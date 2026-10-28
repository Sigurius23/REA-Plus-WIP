.class public final Ldl/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/e;


# instance fields
.field public final b:Ldl/j;

.field public final c:Ljava/net/URL;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/net/URL;

.field public volatile g:[B

.field public h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 8
    sget-object v0, Ldl/j;->a:Ldl/m;

    invoke-direct {p0, p1, v0}, Ldl/i;-><init>(Ljava/lang/String;Ldl/j;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ldl/j;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Ldl/i;->c:Ljava/net/URL;

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iput-object p1, p0, Ldl/i;->d:Ljava/lang/String;

    .line 13
    const-string p1, "Argument must not be null"

    invoke-static {p2, p1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iput-object p2, p0, Ldl/i;->b:Ldl/j;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must not be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 2

    .line 1
    sget-object v0, Ldl/j;->a:Ldl/m;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v1, "Argument must not be null"

    invoke-static {p1, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Ldl/i;->c:Ljava/net/URL;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Ldl/i;->d:Ljava/lang/String;

    .line 6
    invoke-static {v0, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iput-object v0, p0, Ldl/i;->b:Ldl/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 2

    iget-object v0, p0, Ldl/i;->g:[B

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ldl/i;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lwk/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ldl/i;->g:[B

    :cond_0
    iget-object v0, p0, Ldl/i;->g:[B

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ldl/i;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "Argument must not be null"

    iget-object v1, p0, Ldl/i;->c:Ljava/net/URL;

    invoke-static {v1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ldl/i;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldl/i;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Argument must not be null"

    iget-object v1, p0, Ldl/i;->c:Ljava/net/URL;

    invoke-static {v1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "@#&=*+-_.,:!?()/~\'%;$"

    invoke-static {v0, v1}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldl/i;->e:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Ldl/i;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ldl/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ldl/i;

    invoke-virtual {p0}, Ldl/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ldl/i;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldl/i;->b:Ldl/j;

    iget-object p1, p1, Ldl/i;->b:Ldl/j;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ldl/i;->h:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ldl/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Ldl/i;->h:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldl/i;->b:Ldl/j;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ldl/i;->h:I

    :cond_0
    iget v0, p0, Ldl/i;->h:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ldl/i;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
