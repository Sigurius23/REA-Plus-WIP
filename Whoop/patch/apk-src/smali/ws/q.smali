.class public final Lws/q;
.super Lns/t;
.source "SourceFile"


# static fields
.field public static final e:Ljava/math/BigInteger;


# instance fields
.field public final a:I

.field public final b:Ljava/math/BigInteger;

.field public final c:Lws/p;

.field public final d:Lws/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/32 v0, 0x10001

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lws/q;->e:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(ILjava/math/BigInteger;Lws/p;Lws/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lws/q;->a:I

    iput-object p2, p0, Lws/q;->b:Ljava/math/BigInteger;

    iput-object p3, p0, Lws/q;->c:Lws/p;

    iput-object p4, p0, Lws/q;->d:Lws/o;

    return-void
.end method

.method public static b()Lws/n;
    .locals 3

    new-instance v0, Lws/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lws/n;->a:Ljava/lang/Integer;

    sget-object v2, Lws/q;->e:Ljava/math/BigInteger;

    iput-object v2, v0, Lws/n;->b:Ljava/math/BigInteger;

    iput-object v1, v0, Lws/n;->c:Lws/o;

    sget-object v1, Lws/p;->e:Lws/p;

    iput-object v1, v0, Lws/n;->d:Lws/p;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lws/q;->c:Lws/p;

    sget-object v1, Lws/p;->e:Lws/p;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lws/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lws/q;

    iget v0, p1, Lws/q;->a:I

    iget v2, p0, Lws/q;->a:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lws/q;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lws/q;->b:Ljava/math/BigInteger;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lws/q;->c:Lws/p;

    iget-object v2, p0, Lws/q;->c:Lws/p;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lws/q;->d:Lws/o;

    iget-object v0, p0, Lws/q;->d:Lws/o;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget v0, p0, Lws/q;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lws/q;->c:Lws/p;

    iget-object v2, p0, Lws/q;->d:Lws/o;

    const-class v3, Lws/q;

    iget-object v4, p0, Lws/q;->b:Ljava/math/BigInteger;

    filled-new-array {v3, v0, v4, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RSA SSA PKCS1 Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lws/q;->c:Lws/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/q;->d:Lws/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", publicExponent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/q;->b:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lws/q;->a:I

    const-string v2, "-bit modulus)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
