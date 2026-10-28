.class public abstract Lts/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lts/h;

.field public static final b:Lts/k;

.field public static final c:Lts/k;

.field public static final d:Lts/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    invoke-static {}, Lts/h;->b()Ls/m2;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ls/m2;->t(I)V

    sget-object v2, Lts/g;->e:Lts/g;

    iput-object v2, v0, Ls/m2;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Ls/m2;->c()Lts/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    sput-object v0, Lts/l;->a:Lts/h;

    :try_start_1
    invoke-static {}, Lts/k;->b()Lp0/n0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lp0/n0;->l(I)V

    sget-object v2, Lts/g;->j:Lts/g;

    iput-object v2, v0, Lp0/n0;->y:Ljava/lang/Object;

    invoke-virtual {v0}, Lp0/n0;->d()Lts/k;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    sput-object v0, Lts/l;->b:Lts/k;

    :try_start_2
    invoke-static {}, Lts/k;->b()Lp0/n0;

    move-result-object v0

    const/16 v2, 0x40

    invoke-virtual {v0, v2}, Lp0/n0;->l(I)V

    sget-object v2, Lts/g;->l:Lts/g;

    iput-object v2, v0, Lp0/n0;->y:Ljava/lang/Object;

    invoke-virtual {v0}, Lp0/n0;->d()Lts/k;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    sput-object v0, Lts/l;->c:Lts/k;

    :try_start_3
    invoke-static {v1}, Lts/d;->b(I)Lts/d;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    sput-object v0, Lts/l;->d:Lts/d;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
