.class public abstract Lhs/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lat/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lat/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lat/b;-><init>(I)V

    sput-object v0, Lhs/h;->a:Lat/b;

    return-void
.end method

.method public static a([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 4

    array-length v0, p0

    sget-object v1, Lcom/google/crypto/tink/internal/r0;->a:Ljava/nio/charset/Charset;

    const-string v1, "java.vendor"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "The Android Project"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x13

    if-gt v1, v3, :cond_1

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, p0, v2, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    return-object v1

    :cond_1
    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v3, 0x80

    invoke-direct {v1, v3, p0, v2, v0}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    return-object v1
.end method
