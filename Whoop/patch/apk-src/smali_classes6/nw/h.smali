.class public final Lnw/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final E:Lnw/h;

.field public static final x:Lnw/h;

.field public static final y:Lnw/h;

.field public static final z:Lnw/h;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnw/h;

    const-string v1, "EC"

    invoke-direct {v0, v1}, Lnw/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/h;->x:Lnw/h;

    new-instance v0, Lnw/h;

    const-string v1, "RSA"

    invoke-direct {v0, v1}, Lnw/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/h;->y:Lnw/h;

    new-instance v0, Lnw/h;

    const-string v1, "oct"

    invoke-direct {v0, v1}, Lnw/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/h;->z:Lnw/h;

    new-instance v0, Lnw/h;

    const-string v1, "OKP"

    invoke-direct {v0, v1}, Lnw/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/h;->E:Lnw/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lnw/h;->w:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The key type value must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/lang/String;)Lnw/h;
    .locals 2

    if-eqz p0, :cond_4

    sget-object v0, Lnw/h;->x:Lnw/h;

    iget-object v1, v0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lnw/h;->y:Lnw/h;

    iget-object v1, v0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lnw/h;->z:Lnw/h;

    iget-object v1, v0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lnw/h;->E:Lnw/h;

    iget-object v1, v0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    new-instance v0, Lnw/h;

    invoke-direct {v0, p0}, Lnw/h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The key type to parse must not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lnw/h;

    if-eqz v0, :cond_0

    check-cast p1, Lnw/h;

    iget-object p1, p1, Lnw/h;->w:Ljava/lang/String;

    iget-object v0, p0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnw/h;->w:Ljava/lang/String;

    return-object v0
.end method
