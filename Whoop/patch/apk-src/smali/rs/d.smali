.class public abstract Lrs/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;

.field public static final c:Lcom/google/crypto/tink/internal/d0;

.field public static final d:Lcom/google/crypto/tink/internal/b0;

.field public static final e:Lcom/google/crypto/tink/internal/m;

.field public static final f:Lcom/google/crypto/tink/internal/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v1

    sget-object v2, Lvs/h4;->E:Lvs/h4;

    sget-object v3, Lqs/k;->e:Lqs/k;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/h4;->y:Lvs/h4;

    sget-object v3, Lqs/k;->b:Lqs/k;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/h4;->z:Lvs/h4;

    sget-object v3, Lqs/k;->d:Lqs/k;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/h4;->F:Lvs/h4;

    sget-object v3, Lqs/k;->c:Lqs/k;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v1

    sput-object v1, Lrs/d;->a:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v1

    sget-object v2, Lvs/g2;->y:Lvs/g2;

    sget-object v3, Lqs/j;->b:Lqs/j;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/g2;->G:Lvs/g2;

    sget-object v3, Lqs/j;->c:Lqs/j;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/g2;->E:Lvs/g2;

    sget-object v3, Lqs/j;->d:Lqs/j;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/g2;->z:Lvs/g2;

    sget-object v3, Lqs/j;->e:Lqs/j;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v2, Lvs/g2;->F:Lvs/g2;

    sget-object v3, Lqs/j;->f:Lqs/j;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v1

    sput-object v1, Lrs/d;->b:Lwe/o;

    new-instance v1, Los/a;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lqs/l;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lrs/d;->c:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Los/a;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lrs/d;->d:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Los/a;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lqs/h;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lrs/d;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Los/a;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lrs/d;->f:Lcom/google/crypto/tink/internal/k;

    return-void
.end method
