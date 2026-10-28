.class public final Lj11/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lj11/c;

.field private static b:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private static c:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private static d:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lj11/c;

    invoke-direct {v0}, Lj11/c;-><init>()V

    sput-object v0, Lj11/c;->a:Lj11/c;

    new-instance v0, Lio/getstream/chat/android/client/api2/d;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x6723c8b1

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lj11/c;->b:Lc93/m;

    new-instance v0, Lio/getstream/chat/android/client/api2/d;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    new-instance v1, Lx1/b;

    const v3, -0x6961982c

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lj11/c;->c:Lc93/m;

    new-instance v0, Lio/getstream/chat/android/client/api2/d;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    new-instance v1, Lx1/b;

    const v3, 0x470ac36f

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lj11/c;->d:Lc93/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj11/c;->i(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj11/c;->h(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj11/c;->g(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p1, v2

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p1, v2

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p1, v2

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lj11/c;->c:Lc93/m;

    return-object v0
.end method

.method public final e()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lj11/c;->d:Lc93/m;

    return-object v0
.end method

.method public final f()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lj11/c;->b:Lc93/m;

    return-object v0
.end method
