.class public abstract Lxg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lat/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lat/m;

    invoke-direct {v0}, Lat/m;-><init>()V

    sput-object v0, Lxg/a;->a:Lat/m;

    return-void
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    mul-int/lit8 v0, v0, 0x3

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :try_start_0
    sget-object v0, Lxg/a;->a:Lat/m;

    invoke-virtual {v0, v1, p0}, Lat/m;->b(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lc/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to decode base64 string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lc/c;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0
.end method

.method public static b([B)[B
    .locals 4

    array-length v0, p0

    sget-object v1, Lxg/a;->a:Lat/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v0, 0x2

    div-int/lit8 v2, v2, 0x3

    mul-int/lit8 v2, v2, 0x4

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :try_start_0
    invoke-virtual {v1, p0, v0, v3}, Lat/m;->c([BILjava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lc/d;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "exception encoding base64 string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lc/d;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0
.end method
