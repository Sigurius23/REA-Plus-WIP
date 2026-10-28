.class public abstract Lgs/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvs/p3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x10

    invoke-static {v0}, Lgs/c;->c(I)Lvs/p3;

    const/16 v1, 0x20

    invoke-static {v1}, Lgs/c;->c(I)Lvs/p3;

    move-result-object v2

    sput-object v2, Lgs/c;->a:Lvs/p3;

    invoke-static {v0}, Lgs/c;->b(I)V

    invoke-static {v1}, Lgs/c;->b(I)V

    invoke-static {v0, v0}, Lgs/c;->a(II)V

    invoke-static {v1, v1}, Lgs/c;->a(II)V

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    sget-object v1, Lgs/v;->a:Lcom/google/crypto/tink/internal/f0;

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    invoke-virtual {v0, v1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/p3;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    sget-object v2, Lgs/j0;->a:Lcom/google/crypto/tink/internal/f0;

    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v2}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/p3;

    return-void
.end method

.method public static a(II)V
    .locals 3

    invoke-static {}, Lvs/x;->E()Lvs/w;

    move-result-object v0

    invoke-static {}, Lvs/z;->C()Lvs/y;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lvs/y;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/z;

    invoke-virtual {v0, v1}, Lvs/w;->h(Lvs/z;)V

    invoke-virtual {v0, p0}, Lvs/w;->g(I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/x;

    invoke-static {}, Lvs/q2;->F()Lvs/p2;

    move-result-object v0

    invoke-static {}, Lvs/s2;->E()Lvs/r2;

    move-result-object v1

    sget-object v2, Lvs/g2;->E:Lvs/g2;

    invoke-virtual {v1, v2}, Lvs/r2;->g(Lvs/g2;)V

    invoke-virtual {v1, p1}, Lvs/r2;->h(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/s2;

    invoke-virtual {v0, p1}, Lvs/p2;->h(Lvs/s2;)V

    const/16 p1, 0x20

    invoke-virtual {v0, p1}, Lvs/p2;->g(I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/q2;

    invoke-static {}, Lvs/n;->D()Lvs/m;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvs/m;->g(Lvs/x;)V

    invoke-virtual {v0, p1}, Lvs/m;->h(Lvs/q2;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/n;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p1, p0}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p0, Lgs/i;->a:Lcom/google/crypto/tink/internal/f0;

    const-string p0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {p1, p0}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object p0, Lvs/h4;->y:Lvs/h4;

    invoke-virtual {p1, p0}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/p3;

    return-void
.end method

.method public static b(I)V
    .locals 2

    invoke-static {}, Lvs/d0;->D()Lvs/c0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvs/c0;->g(I)V

    invoke-static {}, Lvs/f0;->C()Lvs/e0;

    move-result-object p0

    const/16 v1, 0x10

    invoke-virtual {p0, v1}, Lvs/e0;->g(I)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/f0;

    invoke-virtual {v0, p0}, Lvs/c0;->h(Lvs/f0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/d0;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p0, Lgs/m;->a:Lcom/google/crypto/tink/internal/f0;

    const-string p0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, p0}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object p0, Lvs/h4;->y:Lvs/h4;

    invoke-virtual {v0, p0}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/p3;

    return-void
.end method

.method public static c(I)Lvs/p3;
    .locals 1

    invoke-static {}, Lvs/p0;->C()Lvs/o0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvs/o0;->g(I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/p0;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p0, Lgs/p;->a:Lcom/google/crypto/tink/internal/f0;

    const-string p0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, p0}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object p0, Lvs/h4;->y:Lvs/h4;

    invoke-virtual {v0, p0}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/p3;

    return-object p0
.end method
