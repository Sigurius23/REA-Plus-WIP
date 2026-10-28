.class public final Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;
.super Ljs0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u0010J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008!\u0010 J\'\u0010&\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010#*\u00020\"2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008(\u0010 J\u0010\u0010)\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008)\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010,R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010-R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010-R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;",
        "Ljs0/c;",
        "Lcom/whoop/service/network/ConfigurationApi;",
        "configurationApi",
        "Lbc3/c0;",
        "applicationScope",
        "Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;",
        "configurationsDao",
        "",
        "isDebug",
        "fetchEnabled",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/ConfigurationApi;Lbc3/c0;Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;ZZLtr2/n;)V",
        "fetchConfigurationValuesFromServer",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "Lcom/whoop/service/network/WhoopConfiguration;",
        "fetchConfigurationValuesFromServerAuthed",
        "fetchConfigurationValuesFromServerUnauthed",
        "response",
        "Ll83/a0;",
        "updateConfigurations",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "clearCachedConfigurations",
        "",
        "key",
        "value",
        "addConfigurationToCache",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "loadInitialConfigurationValuesFromDb",
        "()V",
        "logConfigurations",
        "",
        "T",
        "Ljs0/a;",
        "configuration",
        "getConfigurationValueFromJava",
        "(Ljs0/a;)Ljava/lang/Object;",
        "fetchConfigurationValuesAsync",
        "fetchConfigurationValues",
        "Lcom/whoop/service/network/ConfigurationApi;",
        "Lbc3/c0;",
        "Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;",
        "Z",
        "Ltr2/n;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final applicationScope:Lbc3/c0;

.field private final configurationApi:Lcom/whoop/service/network/ConfigurationApi;

.field private final configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

.field private final fetchEnabled:Z

.field private final isDebug:Z

.field private final logger:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/ConfigurationApi;Lbc3/c0;Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;ZZLtr2/n;)V
    .locals 1

    const-string v0, "configurationApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationsDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljs0/c;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationApi:Lcom/whoop/service/network/ConfigurationApi;

    iput-object p2, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->applicationScope:Lbc3/c0;

    iput-object p3, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    iput-boolean p4, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->isDebug:Z

    iput-boolean p5, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchEnabled:Z

    iput-object p6, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    invoke-direct {p0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->loadInitialConfigurationValuesFromDb()V

    return-void
.end method

.method public static final synthetic access$addConfigurationToCache(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->addConfigurationToCache(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$clearCachedConfigurations(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->clearCachedConfigurations(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchConfigurationValuesFromServer(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServer(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchConfigurationValuesFromServerAuthed(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServerAuthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchConfigurationValuesFromServerUnauthed(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServerUnauthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfigurationsDao$p(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;)Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$updateConfigurations(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->updateConfigurations(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final addConfigurationToCache(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    new-instance v2, Lcom/whoop/data/local/room/entity/ConfigurationDto;

    invoke-direct {v2, p1, p2}, Lcom/whoop/data/local/room/entity/ConfigurationDto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$addConfigurationToCache$1;->label:I

    invoke-interface {p3, v2, v0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;->insert(Lcom/whoop/data/local/room/entity/ConfigurationDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Failed to insert configuration into Room DB"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final clearCachedConfigurations(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractMap;->clear()V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$clearCachedConfigurations$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object v0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Unable to delete all cached configurations from Room DB"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final fetchConfigurationValuesFromServer(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v4, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v6, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServerAuthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    check-cast p1, Ljava/util/List;

    iput-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServerUnauthed(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v7, v2

    move-object v2, p1

    move-object p1, v7

    :goto_2
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_8
    iput-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->clearCachedConfigurations(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_9

    goto :goto_4

    :cond_9
    move-object v4, v2

    move-object v2, p1

    :goto_3
    check-cast v2, Ljava/util/Collection;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->updateConfigurations(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    iget-boolean p1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->isDebug:Z

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logConfigurations()V

    :cond_b
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final fetchConfigurationValuesFromServerAuthed(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/WhoopConfiguration;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationApi:Lcom/whoop/service/network/ConfigurationApi;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/service/network/ConfigurationApi;->getConfigurations(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v2, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    const/16 v4, 0x8

    const/4 v5, 0x0

    const-string v1, "Encountered an exception when trying to pull authed configuration service"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method private final fetchConfigurationValuesFromServerUnauthed(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/WhoopConfiguration;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->configurationApi:Lcom/whoop/service/network/ConfigurationApi;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/service/network/ConfigurationApi;->getConfigurationsUnauthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v2, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    const/16 v4, 0x8

    const/4 v5, 0x0

    const-string v1, "Encountered an exception when trying to pull unauthed configuration service"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method private final loadInitialConfigurationValuesFromDb()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$loadInitialConfigurationValuesFromDb$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$loadInitialConfigurationValuesFromDb$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final logConfigurations()V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Configurations:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " : "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->logger:Ltr2/n;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final updateConfigurations(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/WhoopConfiguration;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;

    iget v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/service/network/WhoopConfiguration;

    invoke-virtual {p2}, Lcom/whoop/service/network/WhoopConfiguration;->component1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/whoop/service/network/WhoopConfiguration;->component2()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v4

    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$updateConfigurations$1;->label:I

    invoke-direct {p0, v2, p2, v0}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->addConfigurationToCache(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public fetchConfigurationValues(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchEnabled:Z

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->fetchConfigurationValuesFromServer(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fetchConfigurationValuesAsync()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesAsync$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/ConfigurationRepositoryImpl$fetchConfigurationValuesAsync$1;-><init>(Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public getConfigurationValueFromJava(Ljs0/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljs0/a<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {p1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljs0/b;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
