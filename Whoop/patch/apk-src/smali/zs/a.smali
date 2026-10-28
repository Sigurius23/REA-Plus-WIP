.class public final synthetic Lzs/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/l;
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcq/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lzs/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/internal/k0;)V
    .locals 0

    .line 2
    const/4 p1, 0x7

    iput p1, p0, Lzs/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lzs/a;->w:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "SERVICE_NOT_AVAILABLE"

    if-eqz p1, :cond_4

    const-string v1, "registration_id"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "unregistered"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :goto_0
    return-object v1

    :cond_1
    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RST"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "FirebaseMessaging"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "INSTANCE_ID_RESET"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    check-cast p1, Lys/g;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/j0;->E()Lvs/i0;

    move-result-object v1

    iget-object v2, p1, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lvs/i0;->g(I)V

    invoke-static {p1}, Lzs/c;->b(Lys/g;)Lvs/l0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lvs/i0;->h(Lvs/l0;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/j0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p1, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 4

    check-cast p1, Lys/e;

    invoke-static {}, Lvs/h0;->F()Lvs/g0;

    move-result-object v0

    iget-object v1, p1, Lys/e;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/g0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object p1, p1, Lys/e;->b:Lys/g;

    invoke-static {p1}, Lzs/c;->b(Lys/g;)Lvs/l0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/g0;->h(Lvs/l0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/h0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    const/4 v1, 0x0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, p1, v3, v0, v1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 3

    iget v0, p0, Lzs/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {p1, v1}, Lvs/h0;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/h0;

    move-result-object p1

    invoke-virtual {p1}, Lvs/h0;->E()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lvs/h0;->D()Lvs/l0;

    move-result-object v1

    invoke-virtual {p1}, Lvs/h0;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    invoke-static {v1, v2}, Lzs/c;->a(Lvs/l0;I)Lys/g;

    move-result-object v1

    invoke-virtual {p1}, Lvs/h0;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p1

    invoke-static {p1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object p1

    iget-object v0, v1, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lro/i;->E()I

    move-result v2

    if-ne v0, v2, :cond_0

    new-instance v0, Lys/e;

    invoke-direct {v0, v1, p1}, Lys/e;-><init>(Lys/g;Lro/i;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmHkdfStreamingKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :try_start_1
    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {p1, v1}, Lvs/p;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p;

    move-result-object p1

    invoke-virtual {p1}, Lvs/p;->E()I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lvs/p;->D()Lvs/t;

    move-result-object v1

    invoke-virtual {p1}, Lvs/p;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    invoke-static {v1, v2}, Lzs/b;->b(Lvs/t;I)Lys/d;

    move-result-object v1

    invoke-virtual {p1}, Lvs/p;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p1

    invoke-static {p1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object p1

    iget-object v0, v1, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lro/i;->E()I

    move-result v2

    if-ne v0, v2, :cond_3

    new-instance v0, Lys/a;

    invoke-direct {v0, v1, p1}, Lys/a;-><init>(Lys/d;Lro/i;)V

    return-object v0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCtrHmacStreamingKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvs/j0;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/j0;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lvs/j0;->D()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lvs/j0;->C()Lvs/l0;

    move-result-object v0

    invoke-virtual {p1}, Lvs/j0;->B()I

    move-result p1

    invoke-static {v0, p1}, Lzs/c;->a(Lvs/l0;I)Lys/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 parameters are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesGcmHkdfStreamingParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
