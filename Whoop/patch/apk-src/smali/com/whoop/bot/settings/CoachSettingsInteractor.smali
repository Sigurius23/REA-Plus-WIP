.class public final Lcom/whoop/bot/settings/CoachSettingsInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
        "Lcom/whoop/bot/settings/CoachSettingsDomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsInteractor;",
        "Lod1/g;",
        "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
        "Lcom/whoop/bot/settings/CoachSettingsDomainState;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lu02/c;",
        "apiClient",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;)V",
        "Lec3/l;",
        "Lcom/whoop/bot/settings/InternalEvent;",
        "loadScreenDetails",
        "()Lec3/l;",
        "",
        "key",
        "",
        "enabled",
        "togglesSetting",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lnm0/e;",
        "Lu02/c;",
        "Ljava/time/Clock;",
        "Ltr2/n;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final apiClient:Lu02/c;

.field private final cachedApiSource:Lnm0/e;

.field private final clock:Ljava/time/Clock;

.field private final logger:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->cachedApiSource:Lnm0/e;

    .line 3
    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->apiClient:Lu02/c;

    .line 4
    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->clock:Ljava/time/Clock;

    .line 5
    iput-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->logger:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p3

    const-string p6, "systemDefaultZone(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "CoachSettingsInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/bot/settings/CoachSettingsInteractor;-><init>(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic access$getClock$p(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->clock:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$loadScreenDetails(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->loadScreenDetails()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$togglesSetting(Lcom/whoop/bot/settings/CoachSettingsInteractor;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->togglesSetting(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final loadScreenDetails()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/bot/settings/GetCoachSettingsRequest;

    invoke-direct {v0}, Lcom/whoop/bot/settings/GetCoachSettingsRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->cachedApiSource:Lnm0/e;

    new-instance v3, Lcom/whoop/bot/settings/CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1;

    invoke-direct {v3, v2, v1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsInteractor$loadScreenDetails$$inlined$map$1;

    invoke-direct {v1, v0}, Lcom/whoop/bot/settings/CoachSettingsInteractor$loadScreenDetails$$inlined$map$1;-><init>(Lec3/l;)V

    return-object v1
.end method

.method private final togglesSetting(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Lcom/whoop/bot/settings/PutCoachSettingsRequest;

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsRequest;-><init>(Ljava/lang/String;Z)V

    invoke-direct {p3, v0}, Lcom/whoop/bot/settings/PutCoachSettingsRequest;-><init>(Lcom/whoop/bot/settings/CoachSettingsRequest;)V

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->clock:Ljava/time/Clock;

    invoke-virtual {p1}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object p1

    new-instance p2, La6/u;

    const/4 v0, 0x1

    invoke-direct {p2, p3, v0}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor;->apiClient:Lu02/c;

    const-class v0, Lcom/whoop/bot/settings/CoachSettingsRequest;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, v1, v2}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v0

    const-class v1, Lcom/whoop/bot/settings/CoachSettingsResponse;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v2, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    invoke-static {p2, p3, v0, v1}, Lu02/f;->b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object p2

    new-instance p3, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1;

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0, p1, p0}, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1;-><init>(Lec3/l;Lq83/d;Ljava/time/Instant;Lcom/whoop/bot/settings/CoachSettingsInteractor;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p3}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p2, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$3;

    invoke-direct {p2, v0}, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$3;-><init>(Lq83/d;)V

    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object p3
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;-><init>(Lcom/whoop/bot/settings/CoachSettingsInteractor;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$filterNot$1;

    invoke-direct {p1, v3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$filterNot$1;-><init>(Lec3/l;)V

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;

    invoke-direct {v0, v2, p0}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/bot/settings/CoachSettingsInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    sget-object v1, Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;

    new-instance v3, Lcom/whoop/bot/settings/CoachSettingsResponse;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/bot/settings/CoachSettingsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v3, v2}, Lcom/whoop/bot/settings/CoachSettingsInternalState;-><init>(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;

    invoke-direct {v1, v2}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v2, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$map$1;-><init>(Lec3/l;)V

    return-object v0
.end method
