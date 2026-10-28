.class public final Lio/seon/androidsdk/service/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.android.vending"

    const-string v1, "com.facebook.system"

    const/4 v2, 0x0

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/d0;->e:Ljava/util/List;

    iput-object p1, p0, Lio/seon/androidsdk/service/d0;->a:Ljava/lang/String;

    iput-object p2, p0, Lio/seon/androidsdk/service/d0;->b:Ljava/lang/String;

    iput-object p4, p0, Lio/seon/androidsdk/service/d0;->c:Ljava/lang/String;

    iput-object p3, p0, Lio/seon/androidsdk/service/d0;->d:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 7

    iget-object v0, p0, Lio/seon/androidsdk/service/d0;->e:Ljava/util/List;

    iget-object v1, p0, Lio/seon/androidsdk/service/d0;->a:Ljava/lang/String;

    iget-object v2, p0, Lio/seon/androidsdk/service/d0;->c:Ljava/lang/String;

    iget-object v3, p0, Lio/seon/androidsdk/service/d0;->b:Ljava/lang/String;

    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "inst"

    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "init"

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "orig"

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "sign"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v1, v3

    :cond_1
    :goto_0
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v4

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/d0;->b:Ljava/lang/String;

    iget-object v1, p0, Lio/seon/androidsdk/service/d0;->c:Ljava/lang/String;

    iget-object v2, p0, Lio/seon/androidsdk/service/d0;->e:Ljava/util/List;

    :try_start_0
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/seon/androidsdk/service/d0;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const-string v0, ""

    return-object v0
.end method
