.class public final La53/b;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La53/b;->a:I

    iput-object p1, p0, La53/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La53/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La53/b;->b:Ljava/lang/Object;

    check-cast v0, Lat/y;

    :try_start_0
    sget-object v1, Lat/u;->c:Lat/u;

    iget-object v2, v0, Lat/y;->b:Ljava/lang/String;

    iget-object v1, v1, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v2}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Mac;

    iget-object v0, v0, Lat/y;->c:Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_0
    iget-object v0, p0, La53/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
