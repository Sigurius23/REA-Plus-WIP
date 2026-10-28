.class public final Lws/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final b:Lws/m;

.field public static final c:Lcom/google/crypto/tink/internal/f0;

.field public static final d:Lws/m;

.field public static final e:Lcom/google/crypto/tink/internal/f0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Lws/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lws/m;-><init>(I)V

    sput-object v0, Lws/m;->b:Lws/m;

    new-instance v0, Lts/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/m;->c:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lws/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lws/m;-><init>(I)V

    sput-object v0, Lws/m;->d:Lws/m;

    new-instance v0, Lts/b;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/n;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/m;->e:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lws/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lws/m;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/n;

    return-object v0

    :pswitch_0
    const-class v0, Lfs/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lws/m;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/n;

    return-object v0

    :pswitch_0
    const-class v0, Lfs/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lws/m;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lat/o;

    invoke-direct {v0, p1}, Lat/o;-><init>(La33/d;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lat/n;

    invoke-direct {v0, p1}, Lat/n;-><init>(La33/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
