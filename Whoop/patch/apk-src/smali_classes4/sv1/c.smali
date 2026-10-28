.class public final Lsv1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lsv1/c;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "membership_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    new-instance v1, Lv82/a;

    invoke-direct {v1}, Lv82/a;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lnd1/j;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lsv1/c;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lxx1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->X0(Lxf3/c;Luf3/a;)Lxx1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lxf3/c;Luf3/a;)Lex1/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    const-class v0, Lax1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lax1/b;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lsr2/y;

    new-instance v2, Lex1/c;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lex1/c;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lcx1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->G0(Lxf3/c;Luf3/a;)Lcx1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(Lxf3/c;Luf3/a;)Lfx1/d;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    const-class v0, Lh32/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lh32/a;

    const-class v0, Lax1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lax1/b;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lsr2/y;

    const-class v0, Lcom/whoop/data/coordinator/BannerInvalidator;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lcom/whoop/data/coordinator/BannerInvalidator;

    new-instance v2, Lfx1/d;

    const/16 v10, 0x48

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lfx1/d;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lh32/a;Lbc3/z;Lax1/b;Lcom/whoop/data/coordinator/BannerInvalidator;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Lox1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->P0(Lxf3/c;Luf3/a;)Lox1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;
    .locals 5

    const-string v0, "it"

    const-string v1, "defaultOkHttpClient"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xf

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Lpg3/x0;

    invoke-direct {v1}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsr2/y;

    const-string v4, "MembershipConverterFactory"

    invoke-static {v3, v1, v4}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v3

    const-class v4, Lpg3/m;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/m;

    invoke-virtual {v1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    return-object p0
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Ljx1/a0;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->H0(Lxf3/c;Luf3/a;)Ljx1/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(Lxf3/c;Luf3/a;)Ldx1/c;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldx1/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    const-class v3, Lax1/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lax1/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Ldx1/c;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lyx1/e;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->Z0(Lxf3/c;Luf3/a;)Lyx1/e;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lxf3/c;Luf3/a;)Lbx1/c;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    const-class v0, Lh32/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lh32/a;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lsr2/y;

    const-class v0, Lcom/whoop/data/coordinator/BannerInvalidator;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/whoop/data/coordinator/BannerInvalidator;

    new-instance v2, Lbx1/c;

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lbx1/c;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lh32/a;Lcom/whoop/data/coordinator/BannerInvalidator;Lbc3/z;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lqw1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->t0(Lxf3/c;Luf3/a;)Lqw1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lxf3/c;Luf3/a;)Lkx1/d;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkx1/d;

    const-class v0, Lq22/e;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq22/e;

    invoke-direct {p1, p0}, Lkx1/d;-><init>(Lq22/e;)V

    return-object p1
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lqx1/f;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->N0(Lxf3/c;Luf3/a;)Lqx1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final G0(Lxf3/c;Luf3/a;)Lcx1/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcx1/b;

    invoke-direct {p0}, Lcx1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/navigation/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->w0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/navigation/b;

    move-result-object p0

    return-object p0
.end method

.method private static final H0(Lxf3/c;Luf3/a;)Ljx1/a0;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljx1/a0;

    invoke-direct {p0}, Ljx1/a0;-><init>()V

    return-object p0
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lwx1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->W0(Lxf3/c;Luf3/a;)Lwx1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/navigation/c;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Leb/a0;

    const-class v1, Leb/u0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Leb/u0;

    const-class v1, Lo02/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lo02/d;

    const-class v1, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/r0;

    new-instance v2, Lcom/whoop/membership/management/navigation/c;

    new-instance v1, Lao1/f;

    const/16 v6, 0x10

    invoke-direct {v1, p1, v6}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v6, 0x0

    invoke-virtual {p0, v1, p1, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/o0;

    const-class v1, Lax1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v6, v0, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lax1/b;

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/whoop/membership/management/navigation/c;-><init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Lax1/b;)V

    return-object v2
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lwx1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->U0(Lxf3/c;Luf3/a;)Lwx1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lbx1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->E0(Lxf3/c;Luf3/a;)Lbx1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Lxf3/c;Luf3/a;)Lax1/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lax1/b;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lax1/b;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lqw1/f;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->m0(Lxf3/c;Luf3/a;)Lqw1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lxf3/c;Luf3/a;)Ljx1/d0;
    .locals 12

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljx1/d0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lex1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lex1/c;

    const-class v3, Lfx1/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfx1/d;

    const-class v4, Ldx1/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldx1/c;

    const-class v5, Lbx1/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbx1/c;

    const-class v6, Lcx1/b;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcx1/b;

    const-class v7, Ljx1/a0;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljx1/a0;

    const-class v8, Lkx1/d;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lkx1/d;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Ljx1/d0;-><init>(Lex1/c;Lfx1/d;Ldx1/c;Lbx1/c;Lcx1/b;Ljx1/a0;Lkx1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lux1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->l0(Lxf3/c;Luf3/a;)Lux1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lxf3/c;Luf3/a;)Ltv1/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltv1/b;

    const-class v0, Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Ltv1/b;-><init>(Lcom/whoop/membership/domain/upcycle/UpcycleApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lcom/whoop/membership/returns/domain/ReturnsApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->T0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/returns/domain/ReturnsApi;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lxf3/c;Luf3/a;)Lqx1/f;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lqx1/f;

    invoke-direct {p0}, Lqx1/f;-><init>()V

    return-object p0
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Luw1/f;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->v0(Lxf3/c;Luf3/a;)Luw1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/domain/upcycle/UpcycleApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    return-object p0
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Luw1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->p0(Lxf3/c;Luf3/a;)Luw1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lxf3/c;Luf3/a;)Lox1/b;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    const-class v2, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/r0;

    new-instance v2, Lox1/b;

    new-instance v3, Lao1/f;

    const/16 v4, 0xd

    invoke-direct {v3, p1, v4}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v3, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    invoke-direct {v2, v1, p0}, Lox1/b;-><init>(Leb/a0;Lj02/o0;)V

    return-object v2
.end method

.method public static synthetic Q(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsv1/c;->Q0(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsv1/c;->x0(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lxf3/c;Luf3/a;)Lrx1/a;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrx1/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ltv1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltv1/b;

    const-class v3, Lqx1/f;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lqx1/f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lrx1/a;-><init>(Ltv1/b;Lqx1/f;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/navigation/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->I0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/navigation/c;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/view/upcycle/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/membership/view/upcycle/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lcom/whoop/membership/view/upcycle/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Lzx1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->Y0(Lxf3/c;Luf3/a;)Lzx1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/returns/domain/ReturnsApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/returns/domain/ReturnsApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/returns/domain/ReturnsApi;

    return-object p0
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/domain/api/MembershipManagementApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->c1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Lxf3/c;Luf3/a;)Lwx1/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwx1/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/membership/returns/domain/ReturnsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/returns/domain/ReturnsApi;

    sget-object v3, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "ReturnsInteractorLogger"

    invoke-virtual {v3, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class v4, Lwx1/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwx1/d;

    invoke-direct {p1, v1, v3, p0}, Lwx1/c;-><init>(Lcom/whoop/membership/returns/domain/ReturnsApi;Ltr2/n;Lwx1/d;)V

    return-object p1
.end method

.method public static synthetic V(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->d0(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lxf3/c;Luf3/a;)Lvx1/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvx1/b;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lvx1/b;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Lu82/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->q0(Lxf3/c;Luf3/a;)Lu82/d;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Lxf3/c;Luf3/a;)Lwx1/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwx1/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/remote/api/FileDownloaderApi;

    const-class v3, Lor2/a0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lor2/a0;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "ReturnsPdfHandlerLogger"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    invoke-direct {p1, v1, p0, v0, v2}, Lwx1/d;-><init>(Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltr2/n;Lq83/j;)V

    return-object p1
.end method

.method public static synthetic X(Lxf3/c;Luf3/a;)Ltv1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->M0(Lxf3/c;Luf3/a;)Ltv1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Lxf3/c;Luf3/a;)Lxx1/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lxx1/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    const-class v3, Lor2/k1;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lor2/k1;

    invoke-direct {p1, v1, p0}, Lxx1/a;-><init>(Leb/a0;Lor2/k1;)V

    return-object p1
.end method

.method public static synthetic Y(Lxf3/c;Luf3/a;)Lkx1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->F0(Lxf3/c;Luf3/a;)Lkx1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Lxf3/c;Luf3/a;)Lzx1/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lzx1/a;

    invoke-direct {p0}, Lzx1/a;-><init>()V

    return-object p0
.end method

.method public static synthetic Z(Lxf3/c;Luf3/a;)Lrx1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->R0(Lxf3/c;Luf3/a;)Lrx1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Lxf3/c;Luf3/a;)Lyx1/e;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyx1/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lwx1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwx1/c;

    const-class v3, Lzx1/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lzx1/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lyx1/e;-><init>(Lwx1/c;Lzx1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lhw1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->g0(Lxf3/c;Luf3/a;)Lhw1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Ljx1/d0;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->L0(Lxf3/c;Luf3/a;)Ljx1/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/comunityraf/CommunityRafApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/comunityraf/CommunityRafApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/comunityraf/CommunityRafApi;

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Low1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->u0(Lxf3/c;Luf3/a;)Low1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lnw1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->n0(Lxf3/c;Luf3/a;)Lnw1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;
    .locals 4

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lfw1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->e1(Lxf3/c;Luf3/a;)Lfw1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "membership-feature-models"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lsr2/z;

    const/16 v0, 0xd

    invoke-direct {v6, v0}, Lsr2/z;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x2

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v7

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v3, 0xf

    invoke-direct {v11, v3}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lu22/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "MembershipConverterFactory"

    invoke-static {v7, p0, v3, v2, v4}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lsr2/z;

    const/16 v3, 0x1b

    invoke-direct {v11, v3}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lu82/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, p0, v3, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v3

    const-class v4, Lpg3/m;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-string v5, "clazz"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v3, Lrf3/b;->a:Lqf3/b;

    iget-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    invoke-static {v4, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    iput-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v6, v5, Lqf3/b;->c:Lvf3/a;

    iget-object v5, v5, Lqf3/b;->a:Lvf3/a;

    invoke-static {v4, v6, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {p0, v4, v3, v5}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v3, 0x9

    invoke-direct {v11, v3}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v4, 0x15

    invoke-direct {v11, v4}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/comunityraf/CommunityRafApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v4, 0x17

    invoke-direct {v11, v4}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v3

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/d;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v4, 0x18

    invoke-direct {v11, v4}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lfw1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ljw1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lhw1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Liw1/h;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lew1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v4, 0x1c

    invoke-direct {v11, v4}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v4, Lsx1/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v3

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v3, 0x1d

    invoke-direct {v11, v3}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lux1/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/b;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lsv1/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqw1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/b;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lsv1/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lnw1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/b;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lsv1/b;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ltw1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0xe

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Luw1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lvw1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lpw1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqw1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Low1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Luw1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/familyPlan/navigation/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqv1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x17

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqv1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lex1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lfx1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ldx1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsr2/z;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lsr2/z;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lbx1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lkx1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcx1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ljx1/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/management/navigation/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lax1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ljx1/d0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/4 v1, 0x7

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ltv1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqx1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xa

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lox1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xb

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lrx1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xc

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/view/upcycle/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xd

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/membership/returns/domain/ReturnsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xe

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lwx1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lvx1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lwx1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lxx1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lzx1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lsv1/a;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lsv1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lyx1/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v2}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/management/domain/api/MembershipManagementApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lqv1/f;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->z0(Lxf3/c;Luf3/a;)Lqv1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "MEMBERSHIP_CARD"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "ADJUST_MEMBERSHIP_HEADER"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "MEMBERSHIP_CHECKOUT_CARD"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v3, Ll83/k;

    const-string v4, "DOWNGRADE_MEMBERSHIP_CARD"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v4, Ll83/k;

    const-string v5, "MEMBERSHIP_FEATURES_CARD"

    invoke-direct {v4, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v5, Ll83/k;

    const-string v6, "MEMBERSHIP_CHECKOUT_RADIO_OPTION"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v6, Ll83/k;

    const-string v7, "DIVIDED_CARD_BUTTONS"

    invoke-direct {v6, v7, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v7, Ll83/k;

    const-string v8, "SEND_EMAIL_INVITE"

    invoke-direct {v7, v8, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v8, Ll83/k;

    const-string p1, "COMPARISON_TABLE"

    invoke-direct {v8, p1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v8}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;
    .locals 4

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "MembershipConverterFactory"

    invoke-static {v1, p1, v3}, Lr80/c;->y(Lsr2/y;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    const-class v3, Lpg3/m;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/m;

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->C0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lxf3/c;Luf3/a;)Lu22/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lsv1/c$a;

    invoke-direct {p1, p0}, Lsv1/c$a;-><init>(Lxf3/c;)V

    return-object p1
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lfw1/d;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfw1/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    const-class v3, Lh32/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lh32/a;

    const-class v3, Lrv1/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lrv1/a;

    const-class v3, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v3, Lsr2/y;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lsr2/y;

    const-class v3, Lqw2/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lqw2/c;

    const-class v3, Lew1/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lew1/a;

    const/16 v11, 0xa

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lfw1/d;-><init>(Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;Ltr2/n;Lh32/a;Lbc3/z;Lrv1/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lsr2/y;Lqw2/c;Lew1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lcom/whoop/membership/comunityraf/CommunityRafApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->a1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/comunityraf/CommunityRafApi;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lxf3/c;Luf3/a;)Ljw1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljw1/a;

    const-class v0, Lew1/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lew1/a;

    invoke-direct {p1, p0}, Ljw1/a;-><init>(Lew1/a;)V

    return-object p1
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lcom/whoop/membership/domain/upcycle/UpcycleApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->O0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/domain/upcycle/UpcycleApi;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lxf3/c;Luf3/a;)Lhw1/b;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/r0;

    const-class v2, Leb/a0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    new-instance v2, Lhw1/b;

    new-instance v3, Lao1/f;

    const/16 v4, 0xe

    invoke-direct {v3, v1, v4}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class v1, Lj02/o0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    invoke-direct {v2, p0, p1}, Lhw1/b;-><init>(Lj02/o0;Leb/a0;)V

    return-object v2
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lcom/whoop/membership/view/upcycle/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->S0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/view/upcycle/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h0(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsv1/c;->h0(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lxf3/c;Luf3/a;)Liw1/h;
    .locals 9

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Liw1/h;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lfw1/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfw1/d;

    const-class v4, Ljw1/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljw1/a;

    const-class v5, Lhw1/b;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p1, v6}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v5, p1

    check-cast v5, Lhw1/b;

    const-class p1, Lew1/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lew1/a;

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Liw1/h;-><init>(Lfw1/d;Ljw1/a;Lbc3/c0;Lhw1/b;Lew1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "No value found for type \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x27

    invoke-static {v0, v5, p1, v1}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Ljw1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->f0(Lxf3/c;Luf3/a;)Ljw1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lxf3/c;Luf3/a;)Lew1/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lew1/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfi0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    const-class v3, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-direct {p1, v1, p0}, Lew1/a;-><init>(Lfi0/a;Lcom/whoop/data/local/prefs/PreferenceHelper;)V

    return-object p1
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->d1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    move-result-object p0

    return-object p0
.end method

.method private static final k0(Lxf3/c;Luf3/a;)Lsx1/c;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lsx1/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-class v3, Lrv1/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrv1/a;

    invoke-direct {p1, v1, p0}, Lsx1/c;-><init>(Lbc3/c0;Lrv1/a;)V

    return-object p1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lew1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->j0(Lxf3/c;Luf3/a;)Lew1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lxf3/c;Luf3/a;)Lux1/c;
    .locals 2

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lux1/c;

    const-class v0, Lsx1/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsx1/c;

    invoke-direct {p1, p0}, Lux1/c;-><init>(Lsx1/c;)V

    return-object p1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Ltw1/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->o0(Lxf3/c;Luf3/a;)Ltw1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Lxf3/c;Luf3/a;)Lqw1/f;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lqw1/f;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, p1, v0, p1}, Lqw1/f;-><init>(Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Liw1/h;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->i0(Lxf3/c;Luf3/a;)Liw1/h;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lxf3/c;Luf3/a;)Lnw1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lnw1/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lnw1/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lax1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->K0(Lxf3/c;Luf3/a;)Lax1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lxf3/c;Luf3/a;)Ltw1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltw1/a;

    const-class v0, Lnw1/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnw1/a;

    invoke-direct {p1, p0}, Ltw1/a;-><init>(Lnw1/a;)V

    return-object p1
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lfx1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->B0(Lxf3/c;Luf3/a;)Lfx1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Lxf3/c;Luf3/a;)Luw1/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Luw1/b;

    invoke-direct {p0}, Luw1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lpw1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->s0(Lxf3/c;Luf3/a;)Lpw1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Lxf3/c;Luf3/a;)Lu82/d;
    .locals 11

    const-string v0, "it"

    const-string v1, "membership-feature-models"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {p1, v4, v2, v1, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p1

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    const-string v1, "kt-serialization-membership"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-class v4, Lu82/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu82/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p0, v1}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsv1/c;->J0(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lxf3/c;Luf3/a;)Lvw1/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lvw1/d;

    invoke-direct {p0}, Lvw1/d;-><init>()V

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->b1(Lxf3/c;Luf3/a;)Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lxf3/c;Luf3/a;)Lpw1/d;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpw1/d;

    const-class v0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lpw1/d;-><init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lvw1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->r0(Lxf3/c;Luf3/a;)Lvw1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final t0(Lxf3/c;Luf3/a;)Lqw1/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lqw1/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    const-class v3, Lqw1/f;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lqw1/f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lqw1/d;-><init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Lqw1/f;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lqv1/d;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->y0(Lxf3/c;Luf3/a;)Lqv1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final u0(Lxf3/c;Luf3/a;)Low1/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Low1/b;

    invoke-direct {p0}, Low1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lex1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->A0(Lxf3/c;Luf3/a;)Lex1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(Lxf3/c;Luf3/a;)Luw1/f;
    .locals 10

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luw1/f;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lpw1/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpw1/d;

    const-class v3, Lqw1/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqw1/d;

    const-class v4, Low1/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Low1/b;

    const-class v5, Luw1/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luw1/b;

    const-class v6, Lvw1/d;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lvw1/d;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Luw1/f;-><init>(Lpw1/d;Lqw1/d;Low1/b;Luw1/b;Lvw1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lu22/a;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->e0(Lxf3/c;Luf3/a;)Lu22/a;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lxf3/c;Luf3/a;)Lcom/whoop/membership/familyPlan/navigation/b;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Leb/a0;

    const-class v1, Leb/u0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Leb/u0;

    const-class v1, Lo02/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lo02/d;

    const-class v1, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/r0;

    new-instance v2, Lcom/whoop/membership/familyPlan/navigation/b;

    new-instance v1, Lao1/f;

    const/16 v6, 0xf

    invoke-direct {v1, p1, v6}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v6, 0x0

    invoke-virtual {p0, v1, p1, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/o0;

    const-class v1, Lnw1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v6, v0, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lnw1/a;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v6, p1

    invoke-direct/range {v2 .. v10}, Lcom/whoop/membership/familyPlan/navigation/b;-><init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Ldx1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->D0(Lxf3/c;Luf3/a;)Ldx1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final x0(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lsx1/c;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->k0(Lxf3/c;Luf3/a;)Lsx1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lxf3/c;Luf3/a;)Lqv1/d;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lqv1/d;

    const-class v0, Lcom/whoop/membership/comunityraf/CommunityRafApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/comunityraf/CommunityRafApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CommunityRafInteractor"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lqv1/d;-><init>(Lcom/whoop/membership/comunityraf/CommunityRafApi;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lvx1/b;
    .locals 0

    invoke-static {p0, p1}, Lsv1/c;->V0(Lxf3/c;Luf3/a;)Lvx1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(Lxf3/c;Luf3/a;)Lqv1/f;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lqv1/f;

    invoke-direct {p0}, Lqv1/f;-><init>()V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsv1/c;->c0(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lsv1/c;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
