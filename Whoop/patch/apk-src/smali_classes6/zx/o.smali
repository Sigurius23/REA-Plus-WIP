.class public final Lzx/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lb10/d;

.field public final c:Lyy/j;

.field public final d:Landroid/content/Context;

.field public final e:Ll83/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lb10/c1;->a:Lb10/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    sget-object v0, Lb10/b1;->b:Lb10/d;

    .line 9
    new-instance v1, Lyy/j;

    invoke-direct {v1}, Lyy/j;-><init>()V

    .line 10
    invoke-direct {p0, p1, p2, v0, v1}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;Lb10/d;Lyy/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lb10/d;Lyy/j;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestSurface"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lzx/o;->a:Ljava/util/Set;

    .line 3
    iput-object p3, p0, Lzx/o;->b:Lb10/d;

    .line 4
    iput-object p4, p0, Lzx/o;->c:Lyy/j;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lzx/o;->d:Landroid/content/Context;

    .line 6
    new-instance p1, Lyy/b0;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lzx/o;->e:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)V
    .locals 7

    new-instance v0, Lb10/b;

    const-string v1, "appContext"

    iget-object v2, p0, Lzx/o;->d:Landroid/content/Context;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzx/o;->a:Ljava/util/Set;

    invoke-direct {v0, v2, v1, p2}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object p2, p0, Lzx/o;->c:Lyy/j;

    invoke-virtual {p2, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method
