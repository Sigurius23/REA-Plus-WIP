.class public final synthetic Lb23/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb23/e;
.implements Lgt/e;
.implements Lcom/google/crypto/tink/internal/n;
.implements Ld0/z;
.implements Lcom/google/crypto/tink/internal/g0;
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/l;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb23/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Landroid/content/res/Configuration;)I
    .locals 0

    iget p0, p0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    return p0
.end method

.method public static bridge synthetic b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;
    .locals 0

    check-cast p0, Landroid/view/contentcapture/ContentCaptureSession;

    return-object p0
.end method


# virtual methods
.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    iget v0, p0, Lb23/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lgs/f0;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {p1}, Lgs/g0;->b(Lgs/f0;)Lvs/g4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/f0;->a:Lgs/b0;

    invoke-static {p1}, Lgs/g0;->c(Lgs/b0;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lgs/c0;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/c4;->C()Lvs/b4;

    move-result-object v1

    iget-object v2, p1, Lgs/c0;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lvs/b4;->g(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/c4;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/c0;->b:Lgs/b0;

    invoke-static {p1}, Lgs/d0;->a(Lgs/b0;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 4

    iget v0, p0, Lb23/h;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lgs/e0;

    invoke-static {}, Lvs/e4;->D()Lvs/d4;

    move-result-object v0

    iget-object v1, p1, Lgs/e0;->b:Lgs/f0;

    invoke-static {v1}, Lgs/g0;->b(Lgs/f0;)Lvs/g4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/d4;->g(Lvs/g4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/e4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/e0;->b:Lgs/f0;

    iget-object v1, v1, Lgs/f0;->a:Lgs/b0;

    invoke-static {v1}, Lgs/g0;->c(Lgs/b0;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/e0;->d:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    sget-object v3, Lvs/l3;->F:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lgs/a0;

    invoke-static {}, Lvs/a4;->D()Lvs/z3;

    move-result-object v0

    invoke-static {}, Lvs/c4;->C()Lvs/b4;

    move-result-object v1

    iget-object v2, p1, Lgs/a0;->b:Lgs/c0;

    iget-object v2, v2, Lgs/c0;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lvs/b4;->g(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/c4;

    invoke-virtual {v0, v1}, Lvs/z3;->g(Lvs/c4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/a4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/a0;->b:Lgs/c0;

    iget-object v1, v1, Lgs/c0;->b:Lgs/b0;

    invoke-static {v1}, Lgs/d0;->a(Lgs/b0;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/a0;->d:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    sget-object v3, Lvs/l3;->F:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/q;->V(Lcom/google/crypto/tink/internal/k0;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 3

    iget v0, p0, Lb23/h;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "KmsEnvelopeAeadKeys are only accepted with version 0, got "

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/e4;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/e4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/e4;->C()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lvs/e4;->B()Lvs/g4;

    move-result-object v0

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    invoke-static {v0, v1}, Lgs/g0;->a(Lvs/g4;Lvs/h4;)Lgs/f0;

    move-result-object v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lgs/e0;->Y(Lgs/f0;Ljava/lang/Integer;)Lgs/e0;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKey failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const-string v0, "KmsAeadKey are only accepted with version 0, got "

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/a4;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/a4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/a4;->C()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lvs/a4;->B()Lvs/c4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/c4;->B()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    invoke-static {v1}, Lgs/d0;->b(Lvs/h4;)Lgs/b0;

    move-result-object v1

    new-instance v2, Lgs/c0;

    invoke-direct {v2, v0, v1}, Lgs/c0;-><init>(Ljava/lang/String;Lgs/b0;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v2, p1}, Lgs/a0;->Y(Lgs/c0;Ljava/lang/Integer;)Lgs/a0;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsAeadKey failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lbu/b;

    const-class v1, Lbu/a;

    invoke-static {v1}, Lgt/p;->a(Ljava/lang/Class;)Lgt/p;

    move-result-object v1

    invoke-virtual {p1, v1}, Laa3/i1;->d(Lgt/p;)Ljava/util/Set;

    move-result-object p1

    sget-object v1, Lbu/c;->x:Lbu/c;

    if-nez v1, :cond_1

    const-class v2, Lbu/c;

    monitor-enter v2

    :try_start_0
    sget-object v1, Lbu/c;->x:Lbu/c;

    if-nez v1, :cond_0

    new-instance v1, Lbu/c;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lbu/c;-><init>(I)V

    sput-object v1, Lbu/c;->x:Lbu/c;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2

    goto :goto_2

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    invoke-direct {v0, p1, v1}, Lbu/b;-><init>(Ljava/util/Set;Lbu/c;)V

    return-object v0
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget v0, p0, Lb23/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/g4;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/g4;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {v0, p1}, Lgs/g0;->a(Lvs/g4;Lvs/h4;)Lgs/f0;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/c4;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/c4;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v0}, Lvs/c4;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lgs/d0;->b(Lvs/h4;)Lgs/b0;

    move-result-object p1

    new-instance v1, Lgs/c0;

    invoke-direct {v1, v0, p1}, Lgs/c0;-><init>(Ljava/lang/String;Lgs/b0;)V

    return-object v1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsAeadKeyFormat failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lts/o;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb23/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lgs/i0;

    invoke-static {}, Lat/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lat/e;->h(Lgs/i0;)Lat/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lat/e;->g(Lgs/i0;)Lat/e;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lgs/e0;

    iget-object v0, p1, Lgs/e0;->b:Lgs/f0;

    iget-object v1, v0, Lgs/f0;->b:Ljava/lang/String;

    iget-object v0, v0, Lgs/f0;->d:Lgs/d;

    invoke-static {v1}, Lfs/i;->a(Ljava/lang/String;)Lps/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lps/c;->c(Ljava/lang/String;)Lps/b;

    move-result-object v1

    invoke-static {v0, v1}, Lgs/y;->c(Lgs/d;Lps/b;)Lgs/y;

    move-result-object v0

    iget-object p1, p1, Lgs/e0;->c:Lct/a;

    invoke-static {v0, p1}, Lat/e;->d(Lfs/a;Lct/a;)Lat/e;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lgs/a0;

    iget-object v0, p1, Lgs/a0;->b:Lgs/c0;

    iget-object v1, v0, Lgs/c0;->a:Ljava/lang/String;

    invoke-static {v1}, Lfs/i;->a(Ljava/lang/String;)Lps/c;

    move-result-object v1

    iget-object v0, v0, Lgs/c0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lps/c;->c(Ljava/lang/String;)Lps/b;

    move-result-object v0

    iget-object p1, p1, Lgs/a0;->c:Lct/a;

    invoke-static {v0, p1}, Lat/e;->d(Lfs/a;Lct/a;)Lat/e;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lgs/u;

    invoke-static {}, Lhs/e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lhs/e;->d(Lgs/u;)Lhs/e;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lat/e;->f(Lgs/u;)Lat/e;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_3
    check-cast p1, Lgs/r;

    invoke-static {p1}, Lis/a;->d(Lgs/r;)Lis/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lgs/o;

    invoke-static {p1}, Lat/e;->e(Lgs/o;)Lat/e;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lgs/l;

    invoke-static {p1}, Lat/d;->c(Lgs/l;)Lat/d;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lgs/g;

    invoke-static {p1}, Lat/s;->c(Lgs/g;)Lat/s;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lat/e;->c(Lcom/google/crypto/tink/internal/q;)Lat/e;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(F)F
    .locals 0

    return p1
.end method

.method public isLoggable(Lb23/g;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb23/g;->a()I

    move-result p1

    sget-object p2, Lb23/g;->F:Lb23/g;

    invoke-virtual {p2}, Lb23/g;->a()I

    move-result p2

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
