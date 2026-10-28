.class public abstract Lsr2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ltf3/a;",
        "a",
        "Ltf3/a;",
        "b",
        "()Ltf3/a;",
        "prodModule",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltf3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsr2/p;->c(Ltf3/a;)Ll83/a0;

    sput-object v0, Lsr2/p;->a:Ltf3/a;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lsr2/y;
    .locals 0

    invoke-static {p0, p1}, Lsr2/p;->d(Lxf3/c;Luf3/a;)Lsr2/y;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Ltf3/a;
    .locals 1

    sget-object v0, Lsr2/p;->a:Ltf3/a;

    return-object v0
.end method

.method private static final c(Ltf3/a;)Ll83/a0;
    .locals 7

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lsr2/m;

    const/16 v0, 0x17

    invoke-direct {v5, v0}, Lsr2/m;-><init>(I)V

    new-instance v1, Lqf3/b;

    const-class v0, Lsr2/y;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v2, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, p0, v0, v2}, Ldc/b;->C(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lxf3/c;Luf3/a;)Lsr2/y;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lsr2/q;

    invoke-direct {p0}, Lsr2/q;-><init>()V

    return-object p0
.end method
