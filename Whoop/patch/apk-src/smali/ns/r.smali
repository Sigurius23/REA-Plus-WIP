.class public final Lns/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final b:Lns/r;

.field public static final c:Lcom/google/crypto/tink/internal/f0;

.field public static final d:Lns/r;

.field public static final e:Lcom/google/crypto/tink/internal/f0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Lns/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lns/r;-><init>(I)V

    sput-object v0, Lns/r;->b:Lns/r;

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/d;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lns/r;->c:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lns/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lns/r;-><init>(I)V

    sput-object v0, Lns/r;->d:Lns/r;

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/e;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lns/r;->e:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lns/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lns/r;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/e;

    return-object v0

    :pswitch_0
    const-class v0, Lfs/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lns/r;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/e;

    return-object v0

    :pswitch_0
    const-class v0, Lfs/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lns/r;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lns/s;

    invoke-direct {v0, p1}, Lns/s;-><init>(La33/d;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lat/k;

    invoke-direct {v0, p1}, Lat/k;-><init>(La33/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
