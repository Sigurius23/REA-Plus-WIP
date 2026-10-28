.class public final Lws/x;
.super Lns/t;
.source "SourceFile"


# static fields
.field public static final g:Ljava/math/BigInteger;


# instance fields
.field public final a:I

.field public final b:Ljava/math/BigInteger;

.field public final c:Lws/w;

.field public final d:Lws/v;

.field public final e:Lws/v;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/32 v0, 0x10001

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lws/x;->g:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(ILjava/math/BigInteger;Lws/w;Lws/v;Lws/v;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lws/x;->a:I

    iput-object p2, p0, Lws/x;->b:Ljava/math/BigInteger;

    iput-object p3, p0, Lws/x;->c:Lws/w;

    iput-object p4, p0, Lws/x;->d:Lws/v;

    iput-object p5, p0, Lws/x;->e:Lws/v;

    iput p6, p0, Lws/x;->f:I

    return-void
.end method

.method public static b()Lws/u;
    .locals 3

    new-instance v0, Lws/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lws/u;->a:Ljava/lang/Integer;

    sget-object v2, Lws/x;->g:Ljava/math/BigInteger;

    iput-object v2, v0, Lws/u;->b:Ljava/math/BigInteger;

    iput-object v1, v0, Lws/u;->c:Lws/v;

    iput-object v1, v0, Lws/u;->d:Lws/v;

    iput-object v1, v0, Lws/u;->e:Ljava/lang/Integer;

    sget-object v1, Lws/w;->e:Lws/w;

    iput-object v1, v0, Lws/u;->f:Lws/w;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lws/x;->c:Lws/w;

    sget-object v1, Lws/w;->e:Lws/w;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lws/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lws/x;

    iget v0, p1, Lws/x;->a:I

    iget v2, p0, Lws/x;->a:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lws/x;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lws/x;->b:Ljava/math/BigInteger;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lws/x;->c:Lws/w;

    iget-object v2, p0, Lws/x;->c:Lws/w;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lws/x;->d:Lws/v;

    iget-object v2, p0, Lws/x;->d:Lws/v;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lws/x;->e:Lws/v;

    iget-object v2, p0, Lws/x;->e:Lws/v;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Lws/x;->f:I

    iget v0, p0, Lws/x;->f:I

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 8

    iget v0, p0, Lws/x;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Lws/x;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-class v1, Lws/x;

    iget-object v3, p0, Lws/x;->b:Ljava/math/BigInteger;

    iget-object v4, p0, Lws/x;->c:Lws/w;

    iget-object v5, p0, Lws/x;->d:Lws/v;

    iget-object v6, p0, Lws/x;->e:Lws/v;

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RSA SSA PSS Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lws/x;->c:Lws/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/x;->d:Lws/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mgf1 hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/x;->e:Lws/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", saltLengthBytes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lws/x;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", publicExponent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/x;->b:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lws/x;->a:I

    const-string v2, "-bit modulus)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
