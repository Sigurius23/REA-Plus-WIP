.class public Li92/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/service/network/NotificationApi;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/NotificationApi;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GCM"

    iput-object v0, p0, Li92/j;->a:Ljava/lang/String;

    iput-object p1, p0, Li92/j;->b:Lcom/whoop/service/network/NotificationApi;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Li92/j;->b:Lcom/whoop/service/network/NotificationApi;

    const-string v1, "GCM"

    const-string v2, "com.whoop.android"

    invoke-interface {v0, p1, v1, v2}, Lcom/whoop/service/network/NotificationApi;->registerPush(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxg3/g;

    move-result-object p1

    invoke-static {p1}, Li92/s;->m(Lxg3/g;)Llh3/k;

    move-result-object p1

    return-object p1
.end method
