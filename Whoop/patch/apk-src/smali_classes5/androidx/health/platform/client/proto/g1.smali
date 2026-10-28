.class public final Landroidx/health/platform/client/proto/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Landroidx/health/platform/client/proto/r0;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/r0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/health/platform/client/proto/r0;-><init>(I)V

    sput-object v0, Landroidx/health/platform/client/proto/g1;->b:Landroidx/health/platform/client/proto/r0;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 5
    new-instance v0, Landroidx/health/platform/client/proto/f1;

    .line 6
    :try_start_0
    const-string v1, "androidx.health.platform.client.proto.DescriptorMessageInfoFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 7
    const-string v2, "getInstance"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/m1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8
    :catch_0
    sget-object v1, Landroidx/health/platform/client/proto/g1;->b:Landroidx/health/platform/client/proto/r0;

    :goto_0
    const/4 v2, 0x2

    .line 9
    new-array v2, v2, [Landroidx/health/platform/client/proto/m1;

    sget-object v3, Landroidx/health/platform/client/proto/r0;->b:Landroidx/health/platform/client/proto/r0;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v2, v0, Landroidx/health/platform/client/proto/f1;->a:[Landroidx/health/platform/client/proto/m1;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v1, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/health/platform/client/proto/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    .line 3
    iput-object p0, p1, Landroidx/health/platform/client/proto/k;->c:Landroidx/health/platform/client/proto/g1;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "output"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(ILandroidx/health/platform/client/proto/h;)V
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/health/platform/client/proto/k;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v0, p2}, Landroidx/health/platform/client/proto/k;->H(Landroidx/health/platform/client/proto/h;)V

    return-void
.end method

.method public b(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/health/platform/client/proto/k;

    check-cast p2, Landroidx/health/platform/client/proto/a;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroidx/health/platform/client/proto/k;->O(II)V

    iget-object v1, v0, Landroidx/health/platform/client/proto/k;->c:Landroidx/health/platform/client/proto/g1;

    invoke-interface {p3, p2, v1}, Landroidx/health/platform/client/proto/u2;->h(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Landroidx/health/platform/client/proto/k;->O(II)V

    return-void
.end method

.method public c(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/health/platform/client/proto/k;

    check-cast p2, Landroidx/health/platform/client/proto/a;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {p2, p3}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/health/platform/client/proto/k;->P(I)V

    iget-object p1, v0, Landroidx/health/platform/client/proto/k;->c:Landroidx/health/platform/client/proto/g1;

    invoke-interface {p3, p2, p1}, Landroidx/health/platform/client/proto/u2;->h(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    return-void
.end method
