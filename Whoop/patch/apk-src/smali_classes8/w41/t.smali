.class public final Lw41/t;
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
.field public static final a:Lw41/t;

.field private static b:Lc93/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/p;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw41/t;

    invoke-direct {v0}, Lw41/t;-><init>()V

    sput-object v0, Lw41/t;->a:Lw41/t;

    new-instance v0, Lw41/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x7e685e0c

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lw41/t;->b:Lc93/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw41/t;->c(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_5

    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 p5, p5, 0xc00

    if-nez p5, :cond_7

    move-object p5, p4

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_6

    const/16 p5, 0x800

    goto :goto_4

    :cond_6
    const/16 p5, 0x400

    :goto_4
    or-int/2addr v0, p5

    :cond_7
    and-int/lit16 p5, v0, 0x2493

    const/16 v1, 0x2492

    if-eq p5, v1, :cond_8

    const/4 p5, 0x1

    goto :goto_5

    :cond_8
    const/4 p5, 0x0

    :goto_5
    and-int/lit8 v1, v0, 0x1

    move-object v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v1, p5}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_9

    and-int/lit16 v7, v0, 0x1ffe

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v7}, Lw41/a;->m(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lc93/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/p;"
        }
    .end annotation

    sget-object v0, Lw41/t;->b:Lc93/p;

    return-object v0
.end method
