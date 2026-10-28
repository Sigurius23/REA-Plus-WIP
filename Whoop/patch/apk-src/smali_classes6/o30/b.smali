.class public final Lo30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo30/d;


# static fields
.field public static final z:Lgw/f;


# instance fields
.field public final w:Z

.field public x:B

.field public y:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lgw/f;->z:Lgw/f;

    sput-object v0, Lo30/b;->z:Lgw/f;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lo30/b;->w:Z

    const/4 p1, 0x0

    iput-byte p1, p0, Lo30/b;->x:B

    iput-byte p1, p0, Lo30/b;->y:B

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "="

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, " "

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "+"

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\n"

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/"

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo30/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lo30/b;

    iget-boolean v1, p0, Lo30/b;->w:Z

    iget-boolean v3, p1, Lo30/b;->w:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lo30/b;->x:B

    iget-byte v3, p1, Lo30/b;->x:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-byte v1, p0, Lo30/b;->y:B

    iget-byte p1, p1, Lo30/b;->y:B

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lo30/b;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lo30/b;->x:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-byte v0, p0, Lo30/b;->y:B

    invoke-static {v0}, Ljava/lang/Byte;->hashCode(B)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-byte v0, p0, Lo30/b;->x:B

    iget-byte v1, p0, Lo30/b;->y:B

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DefaultMessageTransformer(isLiveMode="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lo30/b;->w:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", counterSdkToAcs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", counterAcsToSdk="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v1, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
