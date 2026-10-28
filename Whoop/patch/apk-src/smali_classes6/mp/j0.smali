.class public final Lmp/j0;
.super Lmp/b;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final E:Ljava/security/MessageDigest;

.field public final F:I

.field public final G:Z

.field public final H:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    iput-object v0, p0, Lmp/j0;->E:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v1

    iput v1, p0, Lmp/j0;->F:I

    const-string v1, "Hashing.sha256()"

    iput-object v1, p0, Lmp/j0;->H:Ljava/lang/String;

    :try_start_1
    invoke-virtual {v0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lmp/j0;->G:Z

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp/j0;->H:Ljava/lang/String;

    return-object v0
.end method
