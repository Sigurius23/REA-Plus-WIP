.class public Lz82/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static d:Ljava/lang/String; = "Registration"


# instance fields
.field private final a:Lz82/b;

.field private final b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

.field private final c:Lq92/h;


# direct methods
.method public constructor <init>(Lz82/b;Lcom/whoop/data/repositories/AnalyticsUserRepository;Lq92/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz82/e;->a:Lz82/b;

    iput-object p2, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    iput-object p3, p0, Lz82/e;->c:Lq92/h;

    return-void
.end method

.method public static f(Llm2/b;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Llm2/b;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private g(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "communityId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, " - "

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private i(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Reply"

    return-object p1

    :cond_0
    const-string p1, "Comment"

    return-object p1
.end method


# virtual methods
.method public A(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-direct {p0, p2}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Community"

    move-object v2, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public A0(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ly00/t7;->w()Ljava/util/Map;

    move-result-object v10

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, "Local Notification"

    const-string v3, "Bluetooth"

    const/4 v7, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public B()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    sget-object v1, Lz82/e;->d:Ljava/lang/String;

    const-string v2, "Elite Team - Join"

    const-string v3, "Elite"

    const-string v4, "Confirm"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public B0()V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Connect a Strap"

    const-string v3, "Registration"

    invoke-interface {v0, v3, v1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public C(Ljava/lang/String;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    iget-object v1, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v8

    const-string v1, "Pairing - Click Connect"

    const-string v2, "Bluetooth"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v6, "Pick a strap"

    const/4 v7, 0x0

    move-object v5, p1

    move-object v9, p2

    invoke-interface/range {v0 .. v9}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public C0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Teams"

    const-string v3, "Directory"

    const-string v4, "Submit Invite Code"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Open"

    const-string v2, "Team - Create"

    const-string v3, "Teams"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public D0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Teams"

    const-string v2, "Team - Create"

    invoke-interface {v0, v1, p1, p2, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public E()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    sget-object v1, Lz82/e;->d:Ljava/lang/String;

    const-string v2, "Elite Team - Join"

    const-string v3, "Elite"

    const-string v4, "Decline"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public E0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Teams"

    const-string v2, "Team - View"

    invoke-interface {v0, v1, p1, p2, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v1, "Device Settings - Email Diagnostics"

    const-string v2, "Device Settings"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v6, "Press"

    move-object v5, p1

    move-object v7, p2

    invoke-interface/range {v0 .. v9}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public F0(Ljava/lang/String;Z)V
    .locals 12

    if-eqz p2, :cond_0

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v4, "Toggled Track Route On"

    const-string v5, "GPS_enabled"

    const-string v1, "Recording Data"

    const-string v2, "Track Route On"

    move-object v3, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move-object v3, p1

    iget-object v6, p0, Lz82/e;->a:Lz82/b;

    const-string v10, "Toggled Track Route Off"

    const-string v11, "GPS_disabled"

    const-string v7, "Recording Data"

    const-string v8, "Track Route Off"

    move-object v9, v3

    invoke-interface/range {v6 .. v11}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Erase Strap Data"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public G0(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Unpair"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public H(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Explore"

    const-string v2, "Team - Discover"

    const-string v3, "Teams"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public H0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "WHOOP Affiliate"

    const-string v3, "In App Click"

    invoke-interface {v0, p1, v3, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public I(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 7

    const-string v0, " - View Onboarding Screen"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string p1, "step"

    invoke-virtual {v6, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Onboarding"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public I0(Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v3, 0x0

    const-string v4, "WHOOP Gift"

    const/4 v1, 0x0

    move-object v2, p1

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public J(IILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, " - View Onboarding Screen"

    invoke-static {p3, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string p3, "step"

    const-string v0, "previous_step"

    invoke-static {p2, v7, p3, p1, v0}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Onboarding"

    move-object v6, p4

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public J0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Gift Current Member WHOOP - Link Clicked"

    invoke-interface {v0, v1, p1, p2, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Carousel"

    const-string v2, "Team - Discover"

    const-string v3, ""

    invoke-interface {v0, v3, p1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public K0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Individual"

    const-string v2, "Refer Friend- Invite Friend"

    const-string v3, "Referral"

    const-string v4, "Invoked Share"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Firmware Check"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public L0(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 11

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "Selfie"

    const-string v4, "WHOOP Live - Start"

    const/4 v1, 0x0

    move-object v3, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move-object v3, p2

    move-object v5, p3

    iget-object p1, p0, Lz82/e;->a:Lz82/b;

    const-string v7, "Rear-facing"

    const-string v9, "WHOOP Live - Start"

    const/4 v6, 0x0

    move-object v8, v3

    move-object v10, v5

    move-object v5, p1

    invoke-interface/range {v5 .. v10}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public M(Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "HR Broadcast - Enable"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    move-object v6, p2

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "HR Broadcast - Disable"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public M0(I)V
    .locals 6

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v0, "CommunityID"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v5, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Team"

    const-string v4, "Refer Friend- Invite Friend"

    const-string v1, "Referral"

    const-string v2, "Invoked Share"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public N()V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->f()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Received HTTP 429"

    const-string v3, "API"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public N0(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Apply"

    const-string v4, "Team - View"

    const-string v1, "Teams"

    const-string v2, "Calendar Picker"

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v5, "Leaderboard Sort"

    invoke-direct {p0, p3}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v1, "Teams"

    const-string v4, "Team - View"

    move-object v2, p1

    move-object v3, p2

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public O0(Ljava/lang/String;Z)V
    .locals 6

    if-eqz p2, :cond_0

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string p1, "source"

    const-string p2, "Community"

    invoke-virtual {v5, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Community"

    const-string v4, "Bio (Self) - Open"

    const-string v1, "Reviewing Data"

    const-string v2, "Click"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    iget-object p2, p0, Lz82/e;->a:Lz82/b;

    const-string v0, "Teammate Bio"

    const-string v1, "Bio (Other) - Open"

    const-string v2, "other_profile"

    invoke-interface {p2, v2, v0, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public P(Z)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->f()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    if-eqz p1, :cond_0

    const-string p1, "Connected"

    :goto_0
    move-object v7, p1

    goto :goto_1

    :cond_0
    const-string p1, "Disconnected"

    goto :goto_0

    :goto_1
    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "App Foreground - Internet"

    const-string v3, "Connectivity"

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public P0(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-direct {p0, p3}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Team Chat - Manage Message"

    invoke-direct {p0, p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Community"

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public Q(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Open"

    const-string v2, "Community - Join"

    const-string v3, "Community"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public Q0(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 7

    invoke-direct {p0, p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string p1, "Attachment"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v6, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-direct {p0, p3}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Team Chat - Submit"

    const-string v1, "Community"

    const-string v2, "Submit"

    move-object v5, p4

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public R(Z)V
    .locals 4

    const-string v0, "Start Activity"

    const-string v1, "App Permissions Updated"

    const-string v2, "Recording Data"

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "While In Use"

    invoke-interface {p1, v2, v1, v3, v0}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Deny"

    invoke-interface {p1, v2, v1, v3, v0}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public R0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Open"

    const-string v2, "Team - View"

    const-string v3, "Teams"

    const-string v4, "Calendar Picker"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public S()V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "View All in Webview"

    const-string v2, "Member Stories - View"

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v3, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public S0()V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "gift-page"

    const-string v2, "Refer Friend- Invite Friend"

    const/4 v3, 0x0

    invoke-interface {v0, v3, v3, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public T()V
    .locals 6

    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    const-string v0, "screen"

    const-string v1, "Account"

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v3, 0x0

    const-string v4, "Membership Extensions"

    const/4 v1, 0x0

    const-string v2, "In App Click"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v4, "Team - View"

    invoke-direct {p0, p4}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v1, "Teams"

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public U(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Logout"

    const-string v2, "Logout - Select"

    const-string v3, "Navigation"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public U0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Community"

    const-string v2, "Team - Enter Code"

    invoke-interface {v0, v1, p2, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Refer A Friend"

    const-string v2, "Refer Friend- Open"

    const-string v3, "Navigation"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Dismiss"

    const-string v2, "Push Notification"

    const-string v3, "Notifications"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public X(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Onboarding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Ly00/t7;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v8, 0x0

    const-string v9, "new-connectivity-flow"

    const-string v2, "Pairing - First Time Click Connect"

    const-string v3, "Bluetooth"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public Y(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Onboarding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p3}, Ly00/t7;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v8, 0x0

    const-string v9, "new-connectivity-flow"

    const-string v2, "Pairing - First Time Connected Strap"

    const-string v3, "Bluetooth"

    const-string v7, "Success"

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public Z(Ljava/lang/Boolean;)V
    .locals 6

    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    const-string v0, "haptics feedback successful"

    invoke-virtual {v5, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Target Haptics Triggered"

    const-string v4, "Strain Coach - Target Haptics"

    const-string v1, "Strain Coach"

    const-string v2, "Haptics Triggered"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public a(ZILjava/lang/String;)V
    .locals 7

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v0, "communityId"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v6, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Data_Attached"

    invoke-virtual {v6, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-direct {p0, p1}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Team Chat - Add Data"

    const-string v5, ""

    const-string v1, "Community"

    const-string v2, "Attach Data"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public a0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Target Notification Fired"

    const-string v2, "Strain Coach - Target Notification"

    const-string v3, "Strain Coach"

    const-string v4, "Notification Fired"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "Apply"

    const-string v4, "Team List - Sort"

    const-string v1, "Teams"

    move-object v3, p1

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ly00/t7;->x(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    :goto_0
    move-object v10, p3

    goto :goto_1

    :cond_0
    invoke-static {}, Ly00/t7;->k()Ljava/util/Map;

    move-result-object p3

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    iget-object p3, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {p3}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v9

    const-string v2, "Pairing - Connected Strap"

    const-string v3, "Bluetooth"

    const-string v7, "Fail"

    move-object v8, p1

    move-object v6, p2

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public c(ZILjava/lang/String;)V
    .locals 7

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v0, "communityId"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v6, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "StreamChannel_ID"

    invoke-virtual {v6, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-direct {p0, p1}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Team Chat - Add Data"

    const-string v5, ""

    const-string v1, "Community"

    const-string v2, "Open"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public c0(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p3}, Ly00/t7;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    :goto_0
    move-object v10, p2

    goto :goto_1

    :cond_0
    invoke-static {p3}, Ly00/t7;->l(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    iget-object p2, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {p2}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v9

    const-string v2, "Pairing - Connected Strap"

    const-string v3, "Bluetooth"

    const-string v7, "Success"

    const/4 v8, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public d(Z)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz p1, :cond_0

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Edit Name"

    const-string v3, "Device Settings"

    const-string v6, "Gen4"

    const-string v7, "Success"

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Edit Name"

    const-string v3, "Device Settings"

    const-string v6, "Gen4"

    const-string v7, "Fail"

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public d0(Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "Question Button"

    const-string v4, "Help Center - Open"

    const-string v1, "Help"

    move-object v3, p1

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public e()V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Edit Name"

    const-string v3, "Device Settings"

    const-string v6, "Gen4"

    const-string v7, "Save"

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public e0(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Reboot"

    const-string v3, "Device Settings"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public f0(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-interface {v0, p1, p2}, Lfi0/a;->e(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-interface {v0, p1}, Lfi0/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public h0(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-interface {v0, p1, p2}, Lfi0/a;->e(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public i0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Select Activity"

    const-string v2, "Choose Activity Type"

    const-string v3, "Recording Data"

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Select Activity - View Tab"

    invoke-interface {v0, p1, v1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j0(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Community"

    const/4 v3, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v7, "Open"

    const/4 v8, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public k0(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "X"

    const-string v4, "Sleep Coach - Close"

    const-string v1, "Navigation"

    const-string v2, "Close"

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public l()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Team List - Sort"

    const-string v3, "Teams"

    const-string v4, "Open"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Sleep Coach"

    move-object v2, p1

    move-object v4, p2

    move-object v3, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public m()V
    .locals 11

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lz82/e;->c:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v2, "Device Settings - Edit Name"

    const-string v3, "Device Settings"

    const-string v6, "Gen4"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, ""

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public n(ILjava/lang/String;)V
    .locals 6

    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    const-string v0, "CommunityId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v5, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "View Invite"

    const-string v4, "Team - View Invite"

    const-string v1, "Teams"

    move-object v3, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public n0(Ljava/util/Map;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "Open"

    const-string v4, "Sleep Coach - Open"

    const-string v1, "Navigation"

    move-object v5, p1

    move-object v3, p2

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public o()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "Team - Manage"

    const-string v3, "Teams"

    const-string v4, "Add Members - Existing"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public o0(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v1, "update"

    const-string v4, "Sleep Coach 4.0 Interaction"

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v3, 0x0

    const-string v4, "Team - View Invite"

    const-string v1, "Teams"

    const-string v2, "All Invites"

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public p0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "WHOOP Live - Toggle Full"

    const-string v3, "WHOOP Live"

    const-string v4, "Aspect Full"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public q(Ljava/lang/Byte;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Battery "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Battery - Low Battery"

    const-string v2, "Battery"

    const-string v3, "Receive"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public q0()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "WHOOP Live - Toggle Condensed"

    const-string v3, "WHOOP Live"

    const-string v4, "Condensed"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public r()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "12 Hours"

    const-string v2, "Data Sync - Backlog"

    const-string v3, "Data Sync"

    const-string v4, "Bluetooth Latency"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public r0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Share - Camera"

    const-string v2, "WHOOP Live - Share"

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public s()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "4 Hours"

    const-string v2, "Data Sync - Backlog"

    const-string v3, "Data Sync"

    const-string v4, "Bluetooth Latency"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public s0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Share - Imported"

    const-string v2, "WHOOP Live - Share"

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, p1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public t()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Teams"

    const-string v3, "Directory"

    const-string v4, "Browse"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public t0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    const-string v0, "tab"

    invoke-virtual {v5, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v2, "Start Activity"

    const-string v4, "Start Activity - Start"

    const-string v1, "Recording Data"

    move-object v3, p1

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v4, "Team - View"

    invoke-direct {p0, p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Community"

    const-string v2, "Chat"

    const-string v3, ""

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public u0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Discard cancel"

    invoke-direct {p0, p1, v1}, Lz82/e;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Record Activity - Discard"

    const-string v2, "Recording Data"

    const-string v3, "Cancel"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public v(Lzp0/a;)V
    .locals 7

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    invoke-virtual {p1}, Lzp0/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lzp0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lzp0/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v1, "Community"

    const-string v2, "React"

    const-string v4, "Team Chat - Manage Message"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public v0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Discard confirm"

    invoke-direct {p0, p1, v1}, Lz82/e;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Record Activity - Discard"

    const-string v2, "Recording Data"

    const-string v3, "Confirm"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 13

    if-eqz p4, :cond_0

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string p1, "source"

    const-string p2, "Community"

    invoke-virtual {v5, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v3, "Community"

    const-string v4, "Bio (Self) - Open"

    const-string v1, "Reviewing Data"

    const-string v2, "Click"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    iget-object v6, p0, Lz82/e;->a:Lz82/b;

    move/from16 v0, p3

    invoke-direct {p0, v0}, Lz82/e;->i(Z)Ljava/lang/String;

    move-result-object v9

    const-string v10, "Bio (Other) - Open"

    invoke-direct/range {p0 .. p1}, Lz82/e;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v12

    const-string v7, "Community"

    const-string v8, "Team Chat"

    move-object v11, p2

    invoke-interface/range {v6 .. v12}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public w0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Save cancel"

    invoke-direct {p0, p1, v1}, Lz82/e;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "End/Save Activity -\u00a0Cancel"

    const-string v2, "Recording Data"

    const-string v3, "Cancel"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Association Attempt Cancelled"

    const-string v2, "Prompted Companion Device Association"

    const-string v3, "Bluetooth"

    const-string v4, "Companion Device Association Failed"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x0(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Save confirm"

    invoke-direct {p0, p1, v1}, Lz82/e;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "End/Save Activity -\u00a0Confirm"

    const-string v2, "Recording Data"

    const-string v3, "Confirm"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public y()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const/4 v1, 0x0

    const-string v2, "Prompted Companion Device Association"

    const-string v3, "Bluetooth"

    const-string v4, "Companion Device Associated"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public y0(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 7

    new-instance v6, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/HashMap;-><init>(I)V

    const-string v0, "tab"

    invoke-virtual {v6, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v4, "Start Activity - Start"

    const-string v5, "GPS_enabled"

    const-string v1, "Recording Data"

    const-string v2, "Start Activity"

    move-object v3, p1

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    move-object v3, p1

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v4, "Start Activity - Start"

    const-string v5, "GPS_disabled"

    const-string v1, "Recording Data"

    const-string v2, "Start Activity"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public z()V
    .locals 5

    iget-object v0, p0, Lz82/e;->a:Lz82/b;

    const-string v1, "Association Attempt Timed Out"

    const-string v2, "Prompted Companion Device Association"

    const-string v3, "Bluetooth"

    const-string v4, "Companion Device Association Failed"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public z0(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz82/e;->b:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;->getUserType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Onboarding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz82/e;->a:Lz82/b;

    const-string v4, ""

    const-string v5, "Setup Flow - Strap Connected"

    const-string v2, "Bluetooth"

    const-string v3, "Success"

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
