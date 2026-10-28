.class public final Lgw/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:[B

.field public final y:Lxw/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "The string must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lgw/r;->w:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lgw/r;->x:[B

    .line 4
    iput-object p1, p0, Lgw/r;->y:Lxw/b;

    return-void
.end method

.method public constructor <init>(Lxw/b;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lgw/r;->w:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lgw/r;->x:[B

    .line 12
    const-string v0, "The Base64URL-encoded object must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lgw/r;->y:Lxw/b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lgw/r;->w:Ljava/lang/String;

    .line 7
    const-string v1, "The byte array must not be null"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lgw/r;->x:[B

    .line 8
    iput-object v0, p0, Lgw/r;->y:Lxw/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lgw/r;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lgw/r;->x:[B

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/String;

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lgw/r;->y:Lxw/b;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Lxw/a;->a()[B

    move-result-object v0

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
