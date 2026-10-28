.class public abstract Lns/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/d0;

.field public static final b:Lcom/google/crypto/tink/internal/b0;

.field public static final c:Lcom/google/crypto/tink/internal/m;

.field public static final d:Lcom/google/crypto/tink/internal/k;

.field public static final e:Lcom/google/crypto/tink/internal/m;

.field public static final f:Lcom/google/crypto/tink/internal/k;

.field public static final g:Lwe/o;

.field public static final h:Lwe/o;

.field public static final i:Lwe/o;

.field public static final j:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    new-instance v2, Lio/sentry/okhttp/b;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/d0;

    const-class v4, Lns/m;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v3, Lns/o;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v2, Lio/sentry/okhttp/b;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v3, v0, v2}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v3, Lns/o;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v2, Lio/sentry/okhttp/b;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    const-class v4, Lns/p;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v3, Lns/o;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v2, Lio/sentry/okhttp/b;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v3, v1, v2}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v3, Lns/o;->d:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Lio/sentry/okhttp/b;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lns/n;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lns/o;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lio/sentry/okhttp/b;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lns/o;->f:Lcom/google/crypto/tink/internal/k;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    sget-object v2, Lns/l;->d:Lns/l;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    sget-object v2, Lns/l;->b:Lns/l;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    sget-object v2, Lns/l;->c:Lns/l;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->F:Lvs/h4;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lns/o;->g:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/b3;->z:Lvs/b3;

    sget-object v2, Lns/k;->z:Lns/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/b3;->E:Lvs/b3;

    sget-object v2, Lns/k;->E:Lns/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/b3;->F:Lvs/b3;

    sget-object v2, Lns/k;->F:Lns/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/b3;->y:Lvs/b3;

    sget-object v2, Lns/k;->G:Lns/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lns/o;->h:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/a3;->y:Lvs/a3;

    sget-object v2, Lns/j;->z:Lns/j;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/a3;->z:Lvs/a3;

    sget-object v2, Lns/j;->E:Lns/j;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/a3;->E:Lvs/a3;

    sget-object v2, Lns/j;->F:Lns/j;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lns/o;->i:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/z2;->y:Lvs/z2;

    sget-object v2, Lns/i;->z:Lns/i;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/z2;->z:Lvs/z2;

    sget-object v2, Lns/i;->E:Lns/i;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/z2;->E:Lvs/z2;

    sget-object v2, Lns/i;->F:Lns/i;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lns/o;->j:Lwe/o;

    return-void
.end method

.method public static a(Lvs/h4;Lvs/f3;)Lns/m;
    .locals 2

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v0

    sget-object v1, Lns/o;->g:Lwe/o;

    invoke-virtual {v1, p0}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/l;

    iput-object p0, v0, Lzt/q;->E:Ljava/lang/Object;

    sget-object p0, Lns/o;->h:Lwe/o;

    invoke-virtual {p1}, Lvs/f3;->F()Lvs/b3;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/k;

    iput-object p0, v0, Lzt/q;->x:Ljava/lang/Object;

    sget-object p0, Lns/o;->i:Lwe/o;

    invoke-virtual {p1}, Lvs/f3;->E()Lvs/a3;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/j;

    iput-object p0, v0, Lzt/q;->y:Ljava/lang/Object;

    sget-object p0, Lns/o;->j:Lwe/o;

    invoke-virtual {p1}, Lvs/f3;->C()Lvs/z2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/i;

    iput-object p0, v0, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Lzt/q;->k()Lns/m;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lns/m;)Lvs/f3;
    .locals 3

    invoke-static {}, Lvs/f3;->G()Lvs/e3;

    move-result-object v0

    sget-object v1, Lns/o;->h:Lwe/o;

    iget-object v2, p0, Lns/m;->a:Lns/k;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/b3;

    invoke-virtual {v0, v1}, Lvs/e3;->i(Lvs/b3;)V

    sget-object v1, Lns/o;->i:Lwe/o;

    iget-object v2, p0, Lns/m;->b:Lns/j;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/a3;

    invoke-virtual {v0, v1}, Lvs/e3;->h(Lvs/a3;)V

    sget-object v1, Lns/o;->j:Lwe/o;

    iget-object p0, p0, Lns/m;->c:Lns/i;

    invoke-virtual {v1, p0}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/z2;

    invoke-virtual {v0, p0}, Lvs/e3;->g(Lvs/z2;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/f3;

    return-object p0
.end method

.method public static c(Lns/p;)Lvs/j3;
    .locals 3

    invoke-static {}, Lvs/j3;->H()Lvs/i3;

    move-result-object v0

    invoke-virtual {v0}, Lvs/i3;->i()V

    iget-object v1, p0, Lns/p;->b:Lns/m;

    invoke-static {v1}, Lns/o;->b(Lns/m;)Lvs/f3;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/i3;->g(Lvs/f3;)V

    iget-object p0, p0, Lns/p;->c:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/i3;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/j3;

    return-object p0
.end method
