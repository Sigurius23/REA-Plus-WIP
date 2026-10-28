.class public final Lcp0/b1;
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
.field public static final a:Lcp0/b1;

.field private static b:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcp0/b1;

    invoke-direct {v0}, Lcp0/b1;-><init>()V

    sput-object v0, Lcp0/b1;->a:Lcp0/b1;

    new-instance v0, Lck1/h;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lck1/h;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x89db587

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lcp0/b1;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcp0/b1;->c(Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "onToggle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x6

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p2, v0

    :cond_1
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v1, p2, 0x1

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, p1, p2}, Lvy0/p;->t0(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lcp0/b1;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
