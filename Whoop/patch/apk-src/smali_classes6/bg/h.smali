.class public final Lbg/h;
.super Landroidx/room/c1;
.source "SourceFile"


# static fields
.field public static final b:Lbg/h;


# instance fields
.field public final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbg/h;

    const/4 v1, 0x1

    const/16 v2, 0x7f

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v3, v1}, Lbg/h;-><init>(BBBB)V

    sput-object v0, Lbg/h;->b:Lbg/h;

    new-instance v0, Lbg/h;

    invoke-direct {v0, v3, v3, v3, v3}, Lbg/h;-><init>(BBBB)V

    return-void
.end method

.method public constructor <init>(BBBB)V
    .locals 2

    const/4 v0, 0x4

    .line 4
    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    aput-byte p2, v0, p1

    const/4 p1, 0x2

    aput-byte p3, v0, p1

    const/4 p1, 0x3

    aput-byte p4, v0, p1

    invoke-direct {p0, v0}, Lbg/h;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbg/h;->a:[B

    .line 3
    array-length v0, p1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid IPv4 repr: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; expected 4 bytes"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final C()Z
    .locals 3

    iget-object v0, p0, Lbg/h;->a:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v2, 0x7f

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final U()Lbg/k;
    .locals 4

    const/16 v0, 0x10

    new-array v0, v0, [B

    const/16 v1, 0xa

    const/4 v2, -0x1

    aput-byte v2, v0, v1

    const/16 v1, 0xb

    aput-byte v2, v0, v1

    const/4 v1, 0x0

    iget-object v2, p0, Lbg/h;->a:[B

    aget-byte v1, v2, v1

    const/16 v3, 0xc

    aput-byte v1, v0, v3

    const/4 v1, 0x1

    aget-byte v1, v2, v1

    const/16 v3, 0xd

    aput-byte v1, v0, v3

    const/4 v1, 0x2

    aget-byte v1, v2, v1

    const/16 v3, 0xe

    aput-byte v1, v0, v3

    const/4 v1, 0x3

    aget-byte v1, v2, v1

    const/16 v2, 0xf

    aput-byte v1, v0, v2

    new-instance v1, Lbg/k;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lbg/k;-><init>(Ljava/lang/String;[B)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lbg/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lbg/h;

    iget-object v2, p0, Lbg/h;->a:[B

    iget-object p1, p1, Lbg/h;->a:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lbg/h;->a:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Lb72/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    const/16 v1, 0x1e

    iget-object v2, p0, Lbg/h;->a:[B

    const-string v3, "."

    invoke-static {v2, v3, v0, v1}, Lm83/n;->C0([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()[B
    .locals 1

    iget-object v0, p0, Lbg/h;->a:[B

    return-object v0
.end method
