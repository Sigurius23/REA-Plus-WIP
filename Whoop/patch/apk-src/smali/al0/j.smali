.class public final Lal0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lal0/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lal0/j;",
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
        "b",
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
.field public static final b:Lal0/j$a;

.field public static final c:I

.field private static final d:Ltf3/a;


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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lal0/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lal0/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lal0/j;->b:Lal0/j$a;

    const/16 v0, 0x8

    sput v0, Lal0/j;->c:I

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lal0/j;->a1(Ltf3/a;)Ll83/a0;

    sput-object v0, Lal0/j;->d:Ltf3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    new-instance v1, Lv02/a;

    invoke-direct {v1}, Lv02/a;-><init>()V

    new-instance v2, Lv82/a;

    invoke-direct {v2}, Lv82/a;-><init>()V

    const/4 v3, 0x3

    new-array v3, v3, [Lnd1/j;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lal0/j;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lvg0/d;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->n2(Lxf3/c;Luf3/a;)Lvg0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->M2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    move-result-object p0

    return-object p0
.end method

.method private static final A1(Lxf3/c;Luf3/a;)Lfl0/h;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfl0/h;

    const-class p1, Lfl0/g;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lfl0/g;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lfl0/h;-><init>(Lfl0/g;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final A2(Lxf3/c;Luf3/a;)Lcl0/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcl0/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcl0/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcl0/b;

    new-instance v3, La2/d;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, La2/d;-><init>(I)V

    const-class v4, Lxk0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    invoke-direct {p1, v1, p0}, Lcl0/c;-><init>(Lcl0/b;Lxk0/a;)V

    return-object p1
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lml0/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->r2(Lxf3/c;Luf3/a;)Lml0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->H1(Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final B1(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lal0/k;->a()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final B2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic C()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->o2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic C0()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->V2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final C1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitSelectionApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    invoke-virtual {v1}, Lud3/l0;->a()Lud3/k0;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, v1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/CommitSelectionApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/CommitSelectionApi;

    return-object p0
.end method

.method private static final C2(Lxf3/c;Luf3/a;)Lcl0/b;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcl0/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcl0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcl0/a;

    const-class v3, Ljs0/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljs0/c;

    invoke-direct {p1, v1, p0}, Lcl0/b;-><init>(Lcl0/a;Ljs0/c;)V

    return-object p1
.end method

.method public static synthetic D()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->W1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic D0(Lsl0/n0;Lvg0/i0;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->q2(Lsl0/n0;Lvg0/i0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitJournalEntryApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    invoke-virtual {v1}, Lud3/l0;->a()Lud3/k0;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, v1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/CommitJournalEntryApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/CommitJournalEntryApi;

    return-object p0
.end method

.method private static final D2(Lxf3/c;Luf3/a;)Lcl0/a;
    .locals 5

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lv02/b;

    const/4 v3, 0x1

    invoke-direct {v1, v2, p1, v3, v2}, Lv02/b;-><init>(Lcom/google/gson/Gson;Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lvf3/c;

    const-string v3, "serialization_configurable_ktor_client"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, La1/j;

    const/4 v4, 0x4

    invoke-direct {v3, v1, v4}, La1/j;-><init>(Ljava/lang/Object;I)V

    const-class v1, Lv53/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv53/c;

    new-instance v1, Lal0/h;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lal0/h;-><init>(Lv53/c;I)V

    const-class p1, Lu02/c;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu02/c;

    new-instance v1, Lcl0/a;

    new-instance v3, La2/d;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, La2/d;-><init>(I)V

    const-class v4, Lxk0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxk0/a;

    const-class v4, Lor2/x1;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lor2/x1;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-direct {v1, p1, v3, p0, v0}, Lcl0/a;-><init>(Lu02/c;Lxk0/a;Lor2/x1;Lq83/j;)V

    return-object v1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lyk0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->U2(Lxf3/c;Luf3/a;)Lyk0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->K2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final E1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/SubmitFormApi;
    .locals 10

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

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x2

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Lpg3/x0;

    invoke-direct {v1}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpg3/x0;->c(Ljava/lang/String;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v9}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    invoke-static {p0}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/SubmitFormApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/SubmitFormApi;

    return-object p0
.end method

.method private static final E2(Lv02/b;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lzg0/h;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->h2(Lxf3/c;Luf3/a;)Lzg0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/domain/formwidget/f;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->K1(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/domain/formwidget/f;

    move-result-object p0

    return-object p0
.end method

.method private static final F1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/StartTurnApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    invoke-virtual {v1}, Lud3/l0;->a()Lud3/k0;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, v1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/StartTurnApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/StartTurnApi;

    return-object p0
.end method

.method private static final F2(Lv53/c;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->s2(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->g2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G1(Lxf3/c;Luf3/a;)Ldl0/d;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu82/i;

    new-instance v0, Lvf3/c;

    const-string v1, "ai-conversation-json"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lad3/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    invoke-direct {p1, v0}, Lu82/i;-><init>(Lad3/c;)V

    new-instance v0, Ldl0/d;

    new-instance v2, Lal0/b;

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4}, Lal0/b;-><init>(Lu82/i;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnm0/e;

    const-class v2, Liy1/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liy1/c;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "ChatMiniArchWidgetInteractor"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-direct {v0, p1, p0, v1}, Ldl0/d;-><init>(Lnm0/e;Liy1/c;Ltr2/n;)V

    return-object v0
.end method

.method private static final G2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lrg0/d;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->O2(Lxf3/c;Luf3/a;)Lrg0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Lxf3/c;Luf3/a;)Lvg0/y;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->d1(Lxf3/c;Luf3/a;)Lvg0/y;

    move-result-object p0

    return-object p0
.end method

.method private static final H1(Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final H2(Lxf3/c;Luf3/a;)Lil0/b;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/bot/api/AiConversationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/bot/api/AiConversationApi;

    new-instance v2, La2/d;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, La2/d;-><init>(I)V

    const-class v3, Lxk0/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiConversationHistoryInteractor"

    invoke-virtual {p1, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    new-instance v1, Lil0/b;

    invoke-direct {v1, v0, p1, p0}, Lil0/b;-><init>(Lcom/whoop/bot/api/AiConversationApi;Ltr2/n;Lxk0/a;)V

    return-object v1
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lvg0/z0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->t1(Lxf3/c;Luf3/a;)Lvg0/z0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Lxf3/c;Luf3/a;)Lvg0/t0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->l1(Lxf3/c;Luf3/a;)Lvg0/t0;

    move-result-object p0

    return-object p0
.end method

.method private static final I1(Lxf3/c;Luf3/a;)Lol0/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lol0/d;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lol0/d;-><init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final I2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lvg0/q0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->a3(Lxf3/c;Luf3/a;)Lvg0/q0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lxf3/c;Luf3/a;)Lah0/h;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->N1(Lxf3/c;Luf3/a;)Lah0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final J1(Lxf3/c;Luf3/a;)Lol0/b;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lol0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ldl0/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldl0/d;

    const-class v3, Lol0/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lol0/d;

    const-class v4, Lrg0/d;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lrg0/d;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lol0/b;-><init>(Ldl0/d;Lol0/d;Lrg0/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final J2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewModel;
    .locals 6

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lbc3/c0;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lbc3/c0;

    if-nez v0, :cond_3

    new-instance v0, Lor2/m;

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1, v1}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/bot/settings/CoachSettingsInteractor;

    const-class v3, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    new-instance v4, La2/d;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, La2/d;-><init>(I)V

    const-class v5, Lxk0/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    new-instance p1, Lcom/whoop/bot/settings/CoachSettingsViewModel;

    invoke-direct {p1, v0, v2, v3, p0}, Lcom/whoop/bot/settings/CoachSettingsViewModel;-><init>(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;)V

    return-object p1
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lvg0/j;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->v1(Lxf3/c;Luf3/a;)Lvg0/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(Lxf3/c;Luf3/a;)Lvg0/b0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->c2(Lxf3/c;Luf3/a;)Lvg0/b0;

    move-result-object p0

    return-object p0
.end method

.method private static final K1(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/domain/formwidget/f;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu82/i;

    new-instance v0, Lvf3/c;

    const-string v1, "ai-conversation-json"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lad3/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    invoke-direct {p1, v0}, Lu82/i;-><init>(Lad3/c;)V

    new-instance v4, Lcom/whoop/ai/chat/domain/formwidget/f;

    new-instance v0, Lal0/b;

    const/4 v2, 0x2

    invoke-direct {v0, p1, v2}, Lal0/b;-><init>(Lu82/i;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v0, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lnm0/e;

    const-class p1, Lcom/whoop/bot/api/SubmitFormApi;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/whoop/bot/api/SubmitFormApi;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class p1, Lwm0/a;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lwm0/a;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "FormWidgetInteractor"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v9

    invoke-direct/range {v4 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/f;-><init>(Lnm0/e;Lcom/whoop/bot/api/SubmitFormApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Ltr2/n;)V

    return-object v4
.end method

.method private static final K2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lnl0/e;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->d2(Lxf3/c;Luf3/a;)Lnl0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L0(Lxf3/c;Luf3/a;)Lfh0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->R1(Lxf3/c;Luf3/a;)Lfh0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L1(Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsInteractor;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsInteractor;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lnm0/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnm0/e;

    const-class v3, Lu02/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lu02/c;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/bot/settings/CoachSettingsInteractor;-><init>(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lvg0/h;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->p1(Lxf3/c;Luf3/a;)Lvg0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M0(Lxf3/c;Luf3/a;)Lcl0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->C2(Lxf3/c;Luf3/a;)Lcl0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final M1(Lxf3/c;Luf3/a;)Lah0/j;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lah0/j;

    invoke-direct {p0}, Lah0/j;-><init>()V

    return-object p0
.end method

.method private static final M2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lrg0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->T2(Lxf3/c;Luf3/a;)Lrg0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->j2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final N1(Lxf3/c;Luf3/a;)Lah0/h;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lah0/h;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/f;

    const-class v3, Lah0/j;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lah0/j;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lah0/h;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final N2(Lxf3/c;Luf3/a;)Lxk0/a;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<destruct>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v4}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x1

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x2

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/4 v8, 0x4

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v8, v3}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v8, Lxk0/a;

    const-class v3, Lfi0/a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v3, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfi0/a;

    const-string v10, ""

    if-nez v4, :cond_0

    move-object v4, v10

    :cond_0
    if-nez v5, :cond_1

    move-object v11, v10

    goto :goto_0

    :cond_1
    move-object v11, v5

    :goto_0
    if-nez v6, :cond_2

    move-object v12, v10

    goto :goto_1

    :cond_2
    move-object v12, v6

    :goto_1
    if-nez v7, :cond_3

    move-object v13, v10

    goto :goto_2

    :cond_3
    move-object v13, v7

    :goto_2
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v14

    const-string v5, "systemDefaultZone(...)"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Liy1/c;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Liy1/c;

    if-nez v1, :cond_4

    move-object/from16 v16, v10

    :goto_3
    move-object v9, v3

    move-object v10, v4

    goto :goto_4

    :cond_4
    move-object/from16 v16, v1

    goto :goto_3

    :goto_4
    invoke-direct/range {v8 .. v16}, Lxk0/a;-><init>(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Clock;Liy1/c;Ljava/lang/String;)V

    return-object v8
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Lil0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->H2(Lxf3/c;Luf3/a;)Lil0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O0(Lxf3/c;Luf3/a;)Lmh0/g;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->U1(Lxf3/c;Luf3/a;)Lmh0/g;

    move-result-object p0

    return-object p0
.end method

.method private static final O1(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 8

    const-string v0, "it"

    const-string v1, "ai-feature-models"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Ljava/util/Map;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final O2(Lxf3/c;Luf3/a;)Lrg0/d;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrg0/d;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lrg0/d;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Lmh0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->T1(Lxf3/c;Luf3/a;)Lmh0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->v2(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final P1(Lxf3/c;Luf3/a;)Lzl0/e;
    .locals 14

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-class v1, Lr31/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr31/f;

    new-instance v1, Lzl0/e;

    new-instance v10, Lzl0/d;

    const-class v2, Lcom/whoop/bot/api/CommitSelectionApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/CommitSelectionApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "SelectionWidgetInteractor"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    new-instance v2, Lzl0/c;

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v9}, Lzl0/c;-><init>(Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, p0, v0, v2}, Lzl0/d;-><init>(Lcom/whoop/bot/api/CommitSelectionApi;Ltr2/n;Lzl0/c;)V

    move-object v9, v10

    new-instance v10, Lzl0/g;

    invoke-direct {v10, p1}, Lzl0/g;-><init>(Lr31/f;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Lzl0/e;-><init>(Lzl0/d;Lzl0/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private static final P2(Lxf3/c;Luf3/a;)Lrg0/e;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrg0/e;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lrg0/e;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic Q(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->x1(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q0(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->m2(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Q1(Lxf3/c;Luf3/a;)Lyl0/j;
    .locals 9

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Ll21/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll21/c;

    new-instance v2, Lyl0/j;

    new-instance v3, Lyl0/h;

    const-class v4, Lcom/whoop/bot/api/CommitJournalEntryApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v5, v4, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/api/CommitJournalEntryApi;

    sget-object v6, Ltr2/n;->a:Ltr2/n$a;

    const-string v7, "JournalEntryWidgetInteractor"

    invoke-virtual {v6, v7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    invoke-static {p1, v1}, Lyl0/n;->q(Ll21/c;Ljava/lang/String;)Lyl0/g;

    move-result-object v1

    invoke-direct {v3, v4, v6, v1}, Lyl0/h;-><init>(Lcom/whoop/bot/api/CommitJournalEntryApi;Ltr2/n;Lyl0/g;)V

    new-instance v4, Lyl0/l;

    invoke-direct {v4, p1}, Lyl0/l;-><init>(Ll21/c;)V

    const-class p1, Lrg0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v5, p1, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lrg0/e;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lyl0/j;-><init>(Lyl0/h;Lyl0/l;Lrg0/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final Q2(Lxf3/c;Luf3/a;)Lfl0/b;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Lsl0/n0;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Lsl0/n0;

    new-instance v1, Lu82/i;

    new-instance v4, Lvf3/c;

    const-string v5, "ai-conversation-json"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v6, Lad3/c;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v3, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lad3/c;

    invoke-direct {v1, v4}, Lu82/i;-><init>(Lad3/c;)V

    const-class v4, Lcom/whoop/bot/api/AiConversationApi;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/whoop/bot/api/AiConversationApi;

    const-class v4, Lor2/x1;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lor2/x1;

    const-class v4, Lcl0/c;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcl0/c;

    new-instance v4, Lvf3/c;

    const-string v6, "userContext"

    invoke-direct {v4, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lod1/u;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v3, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/u;

    invoke-virtual {v4}, Lod1/u;->g()I

    move-result v9

    new-instance v4, Lal0/b;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v6}, Lal0/b;-><init>(Lu82/i;I)V

    const-class v1, Lnm0/e;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lnm0/e;

    const-class v1, Lu02/c;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lu02/c;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v1, Lbc3/c0;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lbc3/c0;

    new-instance v1, Lal0/e;

    const/4 v4, 0x5

    invoke-direct {v1, v2, v4}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v2, Lxk0/a;

    invoke-virtual {v5, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lxk0/a;

    const-class v1, Lfv1/c;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lfv1/c;

    const-class v1, Lfl0/h;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lfl0/h;

    new-instance v6, Lfl0/b;

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v20}, Lfl0/b;-><init>(Lcom/whoop/bot/api/AiConversationApi;Lor2/x1;ILtr2/n;Lcl0/c;Lnm0/e;Lu02/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lxk0/a;Lfv1/c;Lfl0/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static synthetic R()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->t2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic R0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitJournalEntryApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->D1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitJournalEntryApi;

    move-result-object p0

    return-object p0
.end method

.method private static final R1(Lxf3/c;Luf3/a;)Lfh0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfh0/a;

    const-class v0, Lu02/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu02/c;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lfh0/a;-><init>(Lu02/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final R2(Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lel0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->l2(Lxf3/c;Luf3/a;)Lel0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S0(Lxf3/c;Luf3/a;)Lvg0/b1;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->m1(Lxf3/c;Luf3/a;)Lvg0/b1;

    move-result-object p0

    return-object p0
.end method

.method private static final S1(Lxf3/c;Luf3/a;)Lfh0/g;
    .locals 2

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfh0/g;

    const-class v0, Lfh0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfh0/a;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lfh0/g;-><init>(Lfh0/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final S2(Lsl0/n0;)Luf3/a;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v0

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object v4, v0

    :goto_3
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object v0

    :cond_4
    filled-new-array {v1, v2, v3, v4, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Lal0/l;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->c1(Lxf3/c;Luf3/a;)Lal0/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T0(Lxf3/c;Luf3/a;)Lvg0/s;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->f1(Lxf3/c;Luf3/a;)Lvg0/s;

    move-result-object p0

    return-object p0
.end method

.method private static final T1(Lxf3/c;Luf3/a;)Lmh0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmh0/a;

    const-class v0, Lcom/whoop/bot/api/StartTurnApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/StartTurnApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lmh0/a;-><init>(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final T2(Lxf3/c;Luf3/a;)Lrg0/b;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrg0/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lfi0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfi0/a;

    const-class v4, Liy1/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liy1/c;

    const-class v5, Lrg0/d;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrg0/d;

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    const-string v5, ""

    if-nez v0, :cond_1

    move-object v0, v5

    :cond_1
    const/4 v6, 0x1

    invoke-static {v6, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v6, v3

    :goto_1
    if-nez v6, :cond_3

    move-object v6, v5

    :cond_3
    const/4 v7, 0x2

    invoke-static {v7, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_4

    check-cast v7, Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v7, v3

    :goto_2
    if-nez v7, :cond_5

    move-object v7, v5

    :cond_5
    const/4 v8, 0x3

    invoke-static {v8, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_6

    check-cast v8, Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object v8, v3

    :goto_3
    if-nez v8, :cond_7

    move-object v8, v5

    :cond_7
    const/4 v9, 0x4

    invoke-static {v9, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/String;

    if-eqz v10, :cond_8

    check-cast v9, Ljava/lang/String;

    goto :goto_4

    :cond_8
    move-object v9, v3

    :goto_4
    if-nez v9, :cond_9

    move-object v9, v5

    :cond_9
    const/4 v10, 0x5

    invoke-static {v10, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    instance-of v10, p1, Ljava/lang/String;

    if-eqz v10, :cond_a

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    :cond_a
    if-nez v3, :cond_b

    move-object v10, v5

    move-object v3, v4

    move-object v4, p0

    move-object v5, v0

    goto :goto_5

    :cond_b
    move-object v10, v3

    move-object v5, v0

    move-object v3, v4

    move-object v4, p0

    :goto_5
    invoke-direct/range {v1 .. v10}, Lrg0/b;-><init>(Lfi0/a;Liy1/c;Lrg0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lvg0/v;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->e1(Lxf3/c;Luf3/a;)Lvg0/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U0(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->f2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final U1(Lxf3/c;Luf3/a;)Lmh0/g;
    .locals 2

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmh0/g;

    const-class v0, Lmh0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh0/a;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lmh0/g;-><init>(Lmh0/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final U2(Lxf3/c;Luf3/a;)Lyk0/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lyk0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    new-instance v3, La2/d;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, La2/d;-><init>(I)V

    const-class v4, Lxk0/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "WhoopCoachRepository"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lyk0/a;-><init>(Lcom/whoop/bot/api/WhoopCoachSettingsApi;Lxk0/a;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic V()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->q1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic V0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/AiConversationApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->a2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/AiConversationApi;

    move-result-object p0

    return-object p0
.end method

.method private static final V1(Lxf3/c;Luf3/a;)Lhl0/b;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhl0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/bot/api/AiConversationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/bot/api/AiConversationApi;

    new-instance v3, Lal0/i;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lal0/i;-><init>(I)V

    const-class v4, Lxk0/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxk0/a;

    const-class v4, Lhl0/e;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lhl0/e;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lhl0/b;-><init>(Lcom/whoop/bot/api/AiConversationApi;Lxk0/a;Lhl0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final V2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Lgl0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->X2(Lxf3/c;Luf3/a;)Lgl0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W0(Lxf3/c;Luf3/a;)Lhl0/e;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Y1(Lxf3/c;Luf3/a;)Lhl0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final W1()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final W2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/WhoopCoachSettingsApi;
    .locals 4

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lpg3/x0;

    invoke-direct {v1}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsr2/y;

    invoke-virtual {v3}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    invoke-virtual {v1, p0}, Lpg3/x0;->e(Lud3/l0;)V

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    return-object p0
.end method

.method public static synthetic X(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->S2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0(Lxf3/c;Luf3/a;)Lal0/n;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->n1(Lxf3/c;Luf3/a;)Lal0/n;

    move-result-object p0

    return-object p0
.end method

.method private static final X1(Lxf3/c;Luf3/a;)Lhl0/f;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lhl0/f;

    const/4 p1, 0x1

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, p1, v0}, Lhl0/f;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final X2(Lxf3/c;Luf3/a;)Lgl0/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lnm0/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnm0/e;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v3, "EducationHubInteractor"

    invoke-virtual {v2, v3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    new-instance v3, Lvf3/c;

    const-string v4, "mainPrefs"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lu92/d;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu92/d;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lgl0/a;

    invoke-direct {v1, v0, p0, p1, v2}, Lgl0/a;-><init>(Lnm0/e;Lu92/d;Lq83/j;Ltr2/n;)V

    return-object v1
.end method

.method public static synthetic Y(Lxf3/c;Luf3/a;)Lhl0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->V1(Lxf3/c;Luf3/a;)Lhl0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Lxf3/c;Luf3/a;)Lvg0/l0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->h1(Lxf3/c;Luf3/a;)Lvg0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final Y1(Lxf3/c;Luf3/a;)Lhl0/e;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lhl0/e;

    invoke-direct {p0}, Lhl0/e;-><init>()V

    return-object p0
.end method

.method private static final Y2(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lj/j;

    const-class v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "LocationPermissionsHelper"

    invoke-virtual {p1, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class p1, Lm32/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lm32/a;

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v2, Lm32/d;

    invoke-direct/range {v2 .. v8}, Lm32/d;-><init>(Ltr2/n;Lj/j;Lm32/a;Ljava/util/List;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V

    return-object v2
.end method

.method public static synthetic Z(Lxf3/c;Luf3/a;)Lol0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->J1(Lxf3/c;Luf3/a;)Lol0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z0(Lxf3/c;Luf3/a;)Lpl0/d;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Z1(Lxf3/c;Luf3/a;)Lpl0/d;

    move-result-object p0

    return-object p0
.end method

.method private static final Z1(Lxf3/c;Luf3/a;)Lpl0/d;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpl0/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Ljs0/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljs0/c;

    const-class p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lpl0/d;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Ljb1/a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p1, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No value found for type \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x27

    invoke-static {v0, p0, v1, v2}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final Z2(Lxf3/c;Luf3/a;)Lvg0/m;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/m;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/m;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitSelectionApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->C1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/CommitSelectionApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Lug0/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->p2(Lxf3/c;Luf3/a;)Lug0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Ltf3/a;)Ll83/a0;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "$this$module"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llb1/b1;->a:Llb1/b1;

    invoke-static {}, Lpl0/c;->V()Llb1/y0;

    move-result-object v2

    invoke-virtual {v1, v2}, Llb1/b1;->b(Llb1/y0;)V

    new-instance v7, La6/j;

    const/4 v1, 0x1

    invoke-direct {v7, v1}, La6/j;-><init>(I)V

    new-instance v3, Lqf3/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lal0/m;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    sget-object v9, Lwf3/a;->e:Lvf3/c;

    const/4 v6, 0x0

    const/4 v15, 0x1

    move-object v4, v9

    move v8, v15

    invoke-direct/range {v3 .. v8}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v3, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v6, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v3, v0, v2, v4}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v2

    const-class v3, Lm91/s;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-string v5, "clazz"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-static {v3, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    iput-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v7, v6, Lqf3/b;->c:Lvf3/a;

    iget-object v6, v6, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v7, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v0, v3, v2, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, La6/j;

    const/4 v2, 0x3

    invoke-direct {v12, v2}, La6/j;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lal0/l;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move v13, v15

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v0, v2, v4}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v2

    const-class v3, Ljb1/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v3, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v8, v7, Lqf3/b;->c:Lvf3/a;

    iget-object v7, v7, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v8, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, La6/j;

    const/16 v2, 0xf

    invoke-direct {v12, v2}, La6/j;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lal0/n;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v0, v2, v4}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v2

    const-class v3, Ljb1/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v7, v5, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-static {v3, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    iput-object v7, v5, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v7, v5, Lqf3/b;->c:Lvf3/a;

    iget-object v5, v5, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v7, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v6}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lvf3/c;

    const-string v2, "ai-feature-models"

    invoke-direct {v11, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v12, La6/j;

    const/16 v2, 0x1b

    invoke-direct {v12, v2}, La6/j;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Ljava/util/Map;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ai-conversation-json"

    invoke-static {v8, v0, v2, v4, v3}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lal0/c;

    const/16 v2, 0x9

    invoke-direct {v12, v2}, Lal0/c;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lad3/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/c;

    const/16 v2, 0x15

    invoke-direct {v12, v2}, Lal0/c;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/bot/api/AiConversationApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/d;

    const/4 v2, 0x3

    invoke-direct {v12, v2}, Lal0/d;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/d;

    const/16 v2, 0xa

    invoke-direct {v12, v2}, Lal0/d;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lfl0/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/16 v21, 0x2

    move/from16 v13, v21

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/d;

    const/16 v2, 0xb

    invoke-direct {v12, v2}, Lal0/d;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/m;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/d;

    const/16 v2, 0xc

    invoke-direct {v12, v2}, Lal0/d;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/q0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, La6/j;

    const/16 v2, 0xc

    invoke-direct {v12, v2}, La6/j;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/y;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, La6/j;

    const/16 v2, 0x17

    invoke-direct {v12, v2}, La6/j;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/v;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/c;

    const/4 v2, 0x4

    invoke-direct {v12, v2}, Lal0/c;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/s;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/c;

    const/16 v2, 0xf

    invoke-direct {v12, v2}, Lal0/c;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/h0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v2, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v2, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/c;

    const/16 v2, 0x1a

    invoke-direct {v12, v2}, Lal0/c;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lvg0/l0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v8, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lal0/d;

    const/4 v1, 0x7

    invoke-direct {v12, v1}, Lal0/d;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v1, Lvg0/e0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/i0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    const/16 v19, 0x0

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/w0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/t0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/b1;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lwg0/f;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/h;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/z0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/p;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/j;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lug0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/a0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lfl0/g;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lfl0/h;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, La6/j;

    const/16 v1, 0x10

    invoke-direct {v14, v1}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lcom/whoop/bot/api/CommitSelectionApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, La6/j;

    const/16 v1, 0x11

    invoke-direct {v14, v1}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lcom/whoop/bot/api/CommitJournalEntryApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, La6/j;

    const/16 v1, 0x12

    invoke-direct {v14, v1}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lcom/whoop/bot/api/SubmitFormApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, La6/j;

    const/16 v1, 0x13

    invoke-direct {v14, v1}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lcom/whoop/bot/api/StartTurnApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Ldl0/d;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lol0/d;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lol0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lah0/j;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lah0/h;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lzl0/e;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, La6/j;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, La6/j;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lyl0/j;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lfh0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lfh0/g;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lmh0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lmh0/g;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lhl0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lhl0/f;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, Lal0/c;

    const/4 v1, 0x7

    invoke-direct {v14, v1}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lhl0/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lpl0/d;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lbh0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/b0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lnl0/e;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lzg0/h;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lel0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lvg0/d;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lug0/c;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lml0/c;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v3, v16

    move-object/from16 v1, v17

    move-object/from16 v4, v19

    invoke-virtual {v3}, Lqf3/b;->a()Lj93/d;

    move-result-object v5

    invoke-static {v5, v4, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v3}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v4}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v1, "COACH_WRAPPER_NAVIGATION_ROUTER"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v19

    new-instance v1, Lal0/c;

    const/16 v3, 0x13

    invoke-direct {v1, v3}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v3, v16

    move-object/from16 v2, v17

    move-object/from16 v1, v19

    invoke-virtual {v3}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v1, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v3}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v1, "AI_CHAT_NAVIGATION_ROUTER"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v19

    new-instance v1, Lal0/c;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lyg0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v3, v16

    move-object/from16 v2, v17

    move-object/from16 v1, v19

    invoke-virtual {v3}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v1, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v3}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcl0/c;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    const/16 v19, 0x0

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcl0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcl0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lil0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcom/whoop/bot/settings/CoachSettingsViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/c;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lal0/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lxk0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, Lal0/d;

    const/4 v1, 0x1

    invoke-direct {v14, v1}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lrg0/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, Lal0/d;

    const/4 v1, 0x2

    invoke-direct {v14, v1}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lrg0/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AI_CHAT_ANALYTICS_HELPER"

    invoke-static {v10, v0, v1, v2}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v19

    new-instance v1, Lal0/d;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lrg0/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v3, v16

    move-object/from16 v2, v17

    move-object/from16 v1, v19

    invoke-virtual {v3}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v1, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v3}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lyk0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    const/16 v19, 0x0

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v14, Lal0/d;

    const/4 v1, 0x6

    invoke-direct {v14, v1}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    new-instance v10, Lqf3/b;

    const-class v1, Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-direct/range {v10 .. v15}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v10}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v13, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v10}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lal0/d;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lgl0/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v3, v19

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v3, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v2}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v1, "location-permission-helper"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v19

    new-instance v1, Lal0/d;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lal0/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v17

    new-instance v16, Lqf3/b;

    const-class v2, Lm32/c;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v21}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v3, v16

    move-object/from16 v2, v17

    move-object/from16 v1, v19

    invoke-virtual {v3}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {v4, v1, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v3}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final a2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/AiConversationApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    invoke-virtual {v1}, Lud3/l0;->a()Lud3/k0;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, v1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/bot/api/AiConversationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/api/AiConversationApi;

    return-object p0
.end method

.method private static final a3(Lxf3/c;Luf3/a;)Lvg0/q0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/q0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/q0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lah0/j;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->M1(Lxf3/c;Luf3/a;)Lah0/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lfl0/g;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->z1(Lxf3/c;Luf3/a;)Lfl0/g;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lxf3/c;Luf3/a;)Lal0/m;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lal0/m;

    invoke-direct {p0}, Lal0/m;-><init>()V

    return-object p0
.end method

.method private static final b2(Lxf3/c;Luf3/a;)Lbh0/a;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbh0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Ljs0/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljs0/c;

    const-class p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lbh0/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Ljb1/a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p1, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No value found for type \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x27

    invoke-static {v0, p0, v1, v2}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic c()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->s1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c0(Lxf3/c;Luf3/a;)Lol0/d;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->I1(Lxf3/c;Luf3/a;)Lol0/d;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Lxf3/c;Luf3/a;)Lal0/l;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lal0/l;

    invoke-direct {p0}, Lal0/l;-><init>()V

    return-object p0
.end method

.method private static final c2(Lxf3/c;Luf3/a;)Lvg0/b0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/b0;

    const-class v0, Ljs0/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljs0/c;

    invoke-direct {p1, p0}, Lvg0/b0;-><init>(Ljs0/c;)V

    return-object p1
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lug0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->w1(Lxf3/c;Luf3/a;)Lug0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lxf3/c;Luf3/a;)Lvg0/h0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->g1(Lxf3/c;Luf3/a;)Lvg0/h0;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Lxf3/c;Luf3/a;)Lvg0/y;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/y;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/y;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final d2(Lxf3/c;Luf3/a;)Lnl0/e;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsl0/n0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x27

    const-string v4, "No value found for type \'"

    if-eqz v2, :cond_1

    check-cast v2, Lsl0/n0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lbc3/c0;

    new-instance v1, Lal0/e;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v3, Lel0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lel0/a;

    new-instance v3, Lal0/e;

    const/4 v5, 0x3

    invoke-direct {v3, v2, v5}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v5, Lpl0/d;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpl0/d;

    new-instance v5, Lal0/e;

    const/4 v6, 0x4

    invoke-direct {v5, v2, v6}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v2, Lxk0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v5, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    new-instance v0, Lnl0/e;

    invoke-direct {v0, p1, p0, v1, v3}, Lnl0/e;-><init>(Lbc3/c0;Lxk0/a;Lel0/a;Lpl0/d;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic e(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->e2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/StartTurnApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->F1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/StartTurnApi;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lvg0/v;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/v;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/v;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final e2(Lsl0/n0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lvg0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->r1(Lxf3/c;Luf3/a;)Lvg0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewModel;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->J2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsViewModel;

    move-result-object p0

    return-object p0
.end method

.method private static final f1(Lxf3/c;Luf3/a;)Lvg0/s;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/s;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/s;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final f2(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Lsl0/n0;->g()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lml0/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->u2(Lxf3/c;Luf3/a;)Lml0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lxf3/c;Luf3/a;)Lrg0/e;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->P2(Lxf3/c;Luf3/a;)Lrg0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Lxf3/c;Luf3/a;)Lvg0/h0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/h0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/h0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final g2(Lsl0/n0;)Luf3/a;
    .locals 4

    invoke-virtual {p0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->B1(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->R2(Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lxf3/c;Luf3/a;)Lvg0/l0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/l0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/l0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final h2(Lxf3/c;Luf3/a;)Lzg0/h;
    .locals 12

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsl0/n0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x27

    const-string v4, "No value found for type \'"

    if-eqz v2, :cond_6

    check-cast v2, Lsl0/n0;

    const-class v1, Lvg0/i0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    check-cast v5, Lvg0/i0;

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lor2/m;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lor2/m;

    if-nez v0, :cond_3

    new-instance v0, Lor2/m;

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1, v1}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    move-object v7, v0

    new-instance p1, Lal0/a;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v5, v0}, Lal0/a;-><init>(Lsl0/n0;Lvg0/i0;I)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lug0/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, p1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lug0/c;

    new-instance p1, Lal0/e;

    const/4 v3, 0x0

    invoke-direct {p1, v2, v3}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v3, Lbh0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, p1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Lbh0/a;

    new-instance p1, Lvf3/c;

    const-string v1, "AI_CHAT_ANALYTICS_HELPER"

    invoke-direct {p1, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lal0/e;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v3, Lrg0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lrg0/b;

    invoke-virtual {v2}, Lsl0/n0;->r()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lzg0/g$g;->a:Lzg0/g$g;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_2
    move-object v11, p0

    goto :goto_3

    :cond_4
    sget-object p0, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :goto_3
    new-instance v6, Lzg0/h;

    invoke-direct/range {v6 .. v11}, Lzg0/h;-><init>(Lor2/m;Lrg0/b;Lug0/c;Lbh0/a;Ljava/util/List;)V

    return-object v6

    :cond_5
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic i(Lv02/b;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->E2(Lv02/b;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lxf3/c;Luf3/a;)Lvg0/i0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->j1(Lxf3/c;Luf3/a;)Lvg0/i0;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Lxf3/c;Luf3/a;)Lvg0/e0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/e0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/e0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final i2(Lsl0/n0;Lvg0/i0;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lvg0/p;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->u1(Lxf3/c;Luf3/a;)Lvg0/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->G2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final j1(Lxf3/c;Luf3/a;)Lvg0/i0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/i0;

    const-class v0, Lvg0/h0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvg0/h0;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v0

    const-string v1, "systemDefaultZone(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, v0}, Lvg0/i0;-><init>(Lvg0/h0;Ljava/time/Clock;)V

    return-object p1
.end method

.method private static final j2(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Lsl0/n0;->g()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/WhoopCoachSettingsApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->W2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lxf3/c;Luf3/a;)Lhl0/f;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->X1(Lxf3/c;Luf3/a;)Lhl0/f;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Lxf3/c;Luf3/a;)Lvg0/w0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/w0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/w0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final k2(Lsl0/n0;)Luf3/a;
    .locals 6

    invoke-virtual {p0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lsl0/n0;->e()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v5, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lbh0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->b2(Lxf3/c;Luf3/a;)Lbh0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lxf3/c;Luf3/a;)Lcl0/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->A2(Lxf3/c;Luf3/a;)Lcl0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final l1(Lxf3/c;Luf3/a;)Lvg0/t0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/t0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/t0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final l2(Lxf3/c;Luf3/a;)Lel0/a;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lal0/g;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lal0/g;-><init>(Luf3/a;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lfl0/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lfl0/b;

    const-class v2, Lhl0/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lhl0/b;

    const-class v2, Lhl0/f;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lhl0/f;

    const-class v2, Lil0/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lil0/b;

    const-class v2, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    const-class v2, Lgl0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lgl0/a;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v2, Lzr2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lzr2/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiDomainCombiner"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v14

    new-instance v5, Lel0/a;

    const/16 v19, 0x1e00

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v5 .. v20}, Lel0/a;-><init>(Lfl0/b;Lhl0/b;Lhl0/f;Lil0/b;Lgl0/a;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Ltr2/n;Lel0/e;Lel0/b;Lel0/d;Lel0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method public static synthetic m(Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->L1(Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Landroid/content/Context;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->y2(Landroid/content/Context;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Lxf3/c;Luf3/a;)Lvg0/b1;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvg0/b1;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/api/AiChatApi;

    const-class v3, Ljs0/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljs0/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lvg0/b1;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ljs0/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final m2(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic n(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->k2(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lxf3/c;Luf3/a;)Ldl0/d;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->G1(Lxf3/c;Luf3/a;)Ldl0/d;

    move-result-object p0

    return-object p0
.end method

.method private static final n1(Lxf3/c;Luf3/a;)Lal0/n;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lal0/n;

    invoke-direct {p0}, Lal0/n;-><init>()V

    return-object p0
.end method

.method private static final n2(Lxf3/c;Luf3/a;)Lvg0/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/api/AiChatApi;

    new-instance v1, Lvf3/c;

    const-string v2, "AI_CHAT_ANALYTICS_HELPER"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v2, La2/d;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, La2/d;-><init>(I)V

    const-class v3, Lrg0/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrg0/b;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiChatHistoryInteractor"

    invoke-virtual {p1, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    new-instance v1, Lvg0/d;

    invoke-direct {v1, v0, p1, p0}, Lvg0/d;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;Lrg0/b;)V

    return-object v1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/api/AiChatApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->z2(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/api/AiChatApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->O1(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final o1(Lxf3/c;Luf3/a;)Lwg0/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwg0/f;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lwg0/f;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final o2()Luf3/a;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lal0/m;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->b1(Lxf3/c;Luf3/a;)Lal0/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Lxf3/c;Luf3/a;)Lvg0/a0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->y1(Lxf3/c;Luf3/a;)Lvg0/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p1(Lxf3/c;Luf3/a;)Lvg0/h;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvg0/h;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/api/AiChatApi;

    const-class v3, Lfl0/h;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lfl0/h;

    new-instance v2, Lvf3/c;

    const-string v4, "AI_CHAT_ANALYTICS_HELPER"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v4, La2/d;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, La2/d;-><init>(I)V

    const-class v5, Lrg0/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lrg0/b;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lvg0/h;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Lfl0/h;Lrg0/b;Ltr2/n;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final p2(Lxf3/c;Luf3/a;)Lug0/c;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lsl0/n0;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lsl0/n0;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lvg0/i0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lvg0/i0;

    new-instance v3, Lug0/c;

    new-instance v4, Lal0/a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, p1, v5}, Lal0/a;-><init>(Lsl0/n0;Lvg0/i0;I)V

    const-class p1, Lug0/b;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lug0/b;

    const-class p1, Lvg0/d;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lvg0/d;

    const-class p1, Lvg0/b0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lvg0/b0;

    const-class p1, Lzr2/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lzr2/a;

    const/16 v10, 0x30

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lug0/c;-><init>(Lug0/b;Lvg0/d;Lvg0/b0;Lzr2/a;Lug0/a;Lug0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "No value found for type \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x27

    invoke-static {v0, v3, p1, v1}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lzl0/e;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->P1(Lxf3/c;Luf3/a;)Lzl0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/SubmitFormApi;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->E1(Lxf3/c;Luf3/a;)Lcom/whoop/bot/api/SubmitFormApi;

    move-result-object p0

    return-object p0
.end method

.method private static final q1()Luf3/a;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final q2(Lsl0/n0;Lvg0/i0;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lvg0/e0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->i1(Lxf3/c;Luf3/a;)Lvg0/e0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->w2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final r1(Lxf3/c;Luf3/a;)Lvg0/b;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvg0/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v3

    new-instance v0, Lvf3/c;

    const-string v4, "AI_CHAT_ANALYTICS_HELPER"

    invoke-direct {v0, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v4, La2/d;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, La2/d;-><init>(I)V

    const-class v5, Lrg0/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lrg0/b;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lvg0/b;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Landroid/content/Context;Lrg0/b;Ltr2/n;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final r2(Lxf3/c;Luf3/a;)Lml0/c;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v1, Lal0/g;

    const/4 v3, 0x2

    invoke-direct {v1, p1, v3}, Lal0/g;-><init>(Luf3/a;I)V

    const-class v3, Lj02/o0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lj02/o0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v6, p1

    check-cast v6, Leb/a0;

    new-instance p1, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {p1, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lod1/u;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lod1/u;

    const-class p1, Lo02/d;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Lo02/d;

    new-instance p1, Lal0/i;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Lal0/i;-><init>(I)V

    const-class v1, Lxk0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lxk0/a;

    const-class p1, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lcom/whoop/data/repositories/LanguageRepository;

    new-instance v3, Lml0/c;

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v11}, Lml0/c;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Leb/a0;Lod1/u;Lxk0/a;Lcom/whoop/data/repositories/LanguageRepository;ZLo02/d;)V

    return-object v3

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "No value found for type \'"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x27

    invoke-static {v0, v1, p1, v2}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lm32/c;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Y2(Lxf3/c;Luf3/a;)Lm32/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lv53/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lal0/j;->F2(Lv53/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final s1()Luf3/a;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final s2(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lcl0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->D2(Lxf3/c;Luf3/a;)Lcl0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lxf3/c;Luf3/a;)Lfl0/b;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Q2(Lxf3/c;Luf3/a;)Lfl0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final t1(Lxf3/c;Luf3/a;)Lvg0/z0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/z0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/z0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final t2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(Lsl0/n0;Lvg0/i0;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->i2(Lsl0/n0;Lvg0/i0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lxf3/c;Luf3/a;)Lvg0/w0;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->k1(Lxf3/c;Luf3/a;)Lvg0/w0;

    move-result-object p0

    return-object p0
.end method

.method private static final u1(Lxf3/c;Luf3/a;)Lvg0/p;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/p;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/p;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final u2(Lxf3/c;Luf3/a;)Lml0/c;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v1, Lal0/g;

    const/4 v3, 0x1

    invoke-direct {v1, p1, v3}, Lal0/g;-><init>(Luf3/a;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lj02/o0;

    new-instance p1, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {p1, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lod1/u;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lod1/u;

    const-class p1, Lo02/d;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Lo02/d;

    new-instance p1, La2/d;

    const/16 v1, 0x1d

    invoke-direct {p1, v1}, La2/d;-><init>(I)V

    const-class v1, Lxk0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lxk0/a;

    const-class p1, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lcom/whoop/data/repositories/LanguageRepository;

    new-instance v3, Lml0/c;

    const/4 v6, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v3 .. v11}, Lml0/c;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Leb/a0;Lod1/u;Lxk0/a;Lcom/whoop/data/repositories/LanguageRepository;ZLo02/d;)V

    return-object v3
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lwg0/f;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->o1(Lxf3/c;Luf3/a;)Lwg0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lxf3/c;Luf3/a;)Lxk0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->N2(Lxf3/c;Luf3/a;)Lxk0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final v1(Lxf3/c;Luf3/a;)Lvg0/j;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/j;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/j;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final v2(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lfh0/g;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->S1(Lxf3/c;Luf3/a;)Lfh0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->I2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final w1(Lxf3/c;Luf3/a;)Lug0/b;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lsl0/n0;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    check-cast v3, Lsl0/n0;

    new-instance v5, Lug0/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v6, Lvg0/m;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lvg0/m;

    const-class v7, Lvg0/q0;

    invoke-virtual {v2, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvg0/q0;

    const-class v8, Lvg0/y;

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lvg0/y;

    const-class v9, Lvg0/v;

    invoke-virtual {v2, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvg0/v;

    const-class v10, Lvg0/s;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lvg0/s;

    const-class v11, Lvg0/h;

    invoke-virtual {v2, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lvg0/h;

    const-class v12, Lvg0/b;

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lvg0/b;

    const-class v13, Lvg0/w0;

    invoke-virtual {v2, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lvg0/w0;

    const-class v14, Lvg0/t0;

    invoke-virtual {v2, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v0, v4, v14, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lvg0/t0;

    const-class v15, Lvg0/z0;

    invoke-virtual {v2, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v0, v4, v15, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lvg0/z0;

    move-object/from16 v16, v5

    const-class v5, Lvg0/p;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvg0/p;

    move-object/from16 v17, v5

    const-class v5, Lvg0/b1;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvg0/b1;

    move-object/from16 v18, v5

    const-class v5, Lwg0/f;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwg0/f;

    move-object/from16 v19, v5

    const-class v5, Lvg0/a0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvg0/a0;

    move-object/from16 v20, v5

    const-class v5, Lvg0/j;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvg0/j;

    new-instance v4, Lvf3/c;

    move-object/from16 v22, v5

    const-string v5, "AI_CHAT_ANALYTICS_HELPER"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v5, Lal0/e;

    move-object/from16 v23, v6

    const/4 v6, 0x6

    invoke-direct {v5, v3, v6}, Lal0/e;-><init>(Lsl0/n0;I)V

    const-class v3, Lrg0/b;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v5, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrg0/b;

    const-class v4, Lvg0/i0;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Lvg0/i0;

    const-class v4, Lvg0/l0;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v4, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvg0/l0;

    const-class v6, Lvg0/e0;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v5, v6, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v24, v6

    check-cast v24, Lvg0/e0;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v5, v2, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v21, v3

    move-object/from16 v5, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v22

    move-object/from16 v6, v23

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    invoke-direct/range {v5 .. v25}, Lug0/b;-><init>(Lvg0/m;Lvg0/q0;Lvg0/y;Lvg0/v;Lvg0/s;Lvg0/h;Lvg0/b;Lvg0/w0;Lvg0/t0;Lvg0/z0;Lvg0/p;Lvg0/b1;Lwg0/f;Lvg0/a0;Lvg0/j;Lrg0/b;Lvg0/i0;Lvg0/l0;Lvg0/e0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    move-object/from16 v16, v5

    return-object v16

    :cond_3
    new-instance v0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v2, v4, v1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final w2()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x()Luf3/a;
    .locals 1

    invoke-static {}, Lal0/j;->B2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x0(Lxf3/c;Luf3/a;)Lfl0/h;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->A1(Lxf3/c;Luf3/a;)Lfl0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final x1(Lsl0/n0;)Luf3/a;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_4

    :cond_4
    move-object v6, v0

    :goto_4
    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lsl0/n0;->e()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    :cond_5
    move-object v7, v0

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final x2(Lxf3/c;Luf3/a;)Lyg0/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/content/Context;

    new-instance v1, Lyg0/a;

    new-instance v2, Lal0/f;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    const-class p1, Lj02/o0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v2, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    invoke-direct {v1, p0}, Lyg0/a;-><init>(Lj02/o0;)V

    return-object v1

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "No value found for type \'"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x27

    invoke-static {v0, v1, p1, v2}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lvg0/m;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Z2(Lxf3/c;Luf3/a;)Lvg0/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lxf3/c;Luf3/a;)Lyl0/j;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->Q1(Lxf3/c;Luf3/a;)Lyl0/j;

    move-result-object p0

    return-object p0
.end method

.method private static final y1(Lxf3/c;Luf3/a;)Lvg0/a0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvg0/a0;

    const-class v0, Lcom/whoop/ai/chat/api/AiChatApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lvg0/a0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final y2(Landroid/content/Context;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsInteractor;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->L2(Lxf3/c;Luf3/a;)Lcom/whoop/bot/settings/CoachSettingsInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lxf3/c;Luf3/a;)Lyg0/a;
    .locals 0

    invoke-static {p0, p1}, Lal0/j;->x2(Lxf3/c;Luf3/a;)Lyg0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z1(Lxf3/c;Luf3/a;)Lfl0/g;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfl0/d;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, p0, v0, v1, v0}, Lfl0/d;-><init>(Landroid/content/Context;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final z2(Lxf3/c;Luf3/a;)Lcom/whoop/ai/chat/api/AiChatApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "ai-conversation-json"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lad3/c;

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    invoke-virtual {v1}, Lud3/l0;->a()Lud3/k0;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v1, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, v1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/ai/chat/api/AiChatApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/ai/chat/api/AiChatApi;

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    sget-object v0, Lal0/j;->d:Ltf3/a;

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

    iget-object v0, p0, Lal0/j;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
