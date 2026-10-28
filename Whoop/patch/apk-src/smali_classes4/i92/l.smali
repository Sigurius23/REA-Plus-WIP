.class public Li92/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/whoop/service/network/UsersPreferenceApi;

.field private final b:Li92/o;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/UsersPreferenceApi;Li92/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li92/l;->b:Li92/o;

    iput-object p1, p0, Li92/l;->a:Lcom/whoop/service/network/UsersPreferenceApi;

    return-void
.end method


# virtual methods
.method public a()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserPreferences;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Li92/l;->a:Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-interface {v0}, Lcom/whoop/service/network/UsersPreferenceApi;->getUserPreferences()Lxg3/g;

    move-result-object v0

    invoke-static {v0}, Li92/s;->m(Lxg3/g;)Llh3/k;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserPreferences;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/service/network/model/UserPreferenceDto;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/service/network/model/UserPreferenceDto;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    iget-object p1, p0, Li92/l;->a:Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-interface {p1, v0}, Lcom/whoop/service/network/UsersPreferenceApi;->setUserPreferences(Lcom/whoop/service/network/model/UserPreferenceDto;)Lxg3/g;

    move-result-object p1

    invoke-static {p1}, Li92/s;->m(Lxg3/g;)Llh3/k;

    move-result-object p1

    return-object p1
.end method

.method public c()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ProfileDto;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Li92/l;->b:Li92/o;

    invoke-virtual {v0}, Li92/o;->f()Lxg3/g;

    move-result-object v0

    invoke-static {v0}, Li92/s;->m(Lxg3/g;)Llh3/k;

    move-result-object v0

    return-object v0
.end method
