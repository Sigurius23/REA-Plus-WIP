.class public final Lgs/a0;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lgs/c0;

.field public final c:Lct/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lgs/c0;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lgs/a0;->b:Lgs/c0;

    iput-object p2, p0, Lgs/a0;->c:Lct/a;

    iput-object p3, p0, Lgs/a0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lgs/c0;Ljava/lang/Integer;)Lgs/a0;
    .locals 2

    iget-object v0, p0, Lgs/c0;->b:Lgs/b0;

    sget-object v1, Lgs/b0;->c:Lgs/b0;

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant TINK the value of idRequirement must be non-null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v1, Lgs/b0;->d:Lgs/b0;

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_2

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lgs/a0;

    invoke-direct {v1, p0, v0, p1}, Lgs/a0;-><init>(Lgs/c0;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unknown Variant: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
