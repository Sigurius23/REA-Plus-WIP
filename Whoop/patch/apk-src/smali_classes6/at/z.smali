.class public final Lat/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/j;


# static fields
.field public static final e:[B


# instance fields
.field public final a:Lts/m;

.field public final b:I

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Lat/z;->e:[B

    return-void
.end method

.method public constructor <init>(Lat/y;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lat/z;->a:Lts/m;

    .line 3
    iput p2, p0, Lat/z;->b:I

    const/4 v0, 0x0

    .line 4
    new-array v1, v0, [B

    iput-object v1, p0, Lat/z;->c:[B

    .line 5
    new-array v1, v0, [B

    iput-object v1, p0, Lat/z;->d:[B

    const/16 v1, 0xa

    if-lt p2, v1, :cond_0

    .line 6
    new-array v0, v0, [B

    invoke-virtual {p1, p2, v0}, Lat/y;->a(I[B)[B

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "tag size too small, need at least 10 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lqs/a;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Lat/x;

    .line 10
    iget-object v1, p1, Lqs/a;->c:Lro/i;

    .line 11
    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    .line 12
    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Lat/x;-><init>([B)V

    iput-object v0, p0, Lat/z;->a:Lts/m;

    .line 14
    iget-object v0, p1, Lqs/a;->b:Lqs/d;

    .line 15
    iget v1, v0, Lqs/d;->b:I

    .line 16
    iput v1, p0, Lat/z;->b:I

    .line 17
    iget-object p1, p1, Lqs/a;->d:Lct/a;

    .line 18
    invoke-virtual {p1}, Lct/a;->b()[B

    move-result-object p1

    iput-object p1, p0, Lat/z;->c:[B

    .line 19
    iget-object p1, v0, Lqs/d;->c:Lqs/c;

    .line 20
    sget-object v0, Lqs/c;->d:Lqs/c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 21
    sget-object p1, Lat/z;->e:[B

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lat/z;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 22
    new-array p1, p1, [B

    iput-object p1, p0, Lat/z;->d:[B

    return-void
.end method

.method public constructor <init>(Lqs/h;)V
    .locals 6

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lat/y;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HMAC"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    iget-object v3, p1, Lqs/h;->b:Lqs/l;

    .line 26
    iget-object v4, v3, Lqs/l;->d:Lqs/j;

    .line 27
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    .line 28
    iget-object v5, p1, Lqs/h;->c:Lro/i;

    .line 29
    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Lct/a;

    .line 30
    invoke-virtual {v5}, Lct/a;->b()[B

    move-result-object v5

    .line 31
    invoke-direct {v4, v5, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v0, v1, v4}, Lat/y;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    iput-object v0, p0, Lat/z;->a:Lts/m;

    .line 32
    iget v0, v3, Lqs/l;->b:I

    .line 33
    iput v0, p0, Lat/z;->b:I

    .line 34
    iget-object p1, p1, Lqs/h;->d:Lct/a;

    .line 35
    invoke-virtual {p1}, Lct/a;->b()[B

    move-result-object p1

    iput-object p1, p0, Lat/z;->c:[B

    .line 36
    iget-object p1, v3, Lqs/l;->c:Lqs/k;

    .line 37
    sget-object v0, Lqs/k;->d:Lqs/k;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    sget-object p1, Lat/z;->e:[B

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lat/z;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 39
    new-array p1, p1, [B

    iput-object p1, p0, Lat/z;->d:[B

    return-void
.end method

.method public static b(Lqs/a;)Lat/z;
    .locals 1

    new-instance v0, Lat/z;

    invoke-direct {v0, p0}, Lat/z;-><init>(Lqs/a;)V

    return-object v0
.end method

.method public static c(Lqs/h;)Lat/z;
    .locals 1

    new-instance v0, Lat/z;

    invoke-direct {v0, p0}, Lat/z;-><init>(Lqs/h;)V

    return-object v0
.end method


# virtual methods
.method public final a([B)[B
    .locals 5

    iget-object v0, p0, Lat/z;->d:[B

    array-length v1, v0

    iget v2, p0, Lat/z;->b:I

    iget-object v3, p0, Lat/z;->a:Lts/m;

    iget-object v4, p0, Lat/z;->c:[B

    if-lez v1, :cond_0

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    invoke-interface {v3, v2, p1}, Lts/m;->a(I[B)[B

    move-result-object p1

    filled-new-array {v4, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {v3, v2, p1}, Lts/m;->a(I[B)[B

    move-result-object p1

    filled-new-array {v4, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    return-object p1
.end method
