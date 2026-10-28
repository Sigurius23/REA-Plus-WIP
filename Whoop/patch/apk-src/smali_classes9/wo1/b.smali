.class public final Lwo1/b;
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
.field public static final a:Lwo1/b;

.field private static b:Lc93/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/n;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lwo1/b;

    invoke-direct {v0}, Lwo1/b;-><init>()V

    sput-object v0, Lwo1/b;->a:Lwo1/b;

    new-instance v0, Ld30/c;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ld30/c;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x5579b18

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lwo1/b;->b:Lc93/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lqy0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwo1/b;->d(Lqy0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lqy0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/b;->e(Lkotlin/jvm/functions/Function1;Lqy0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lqy0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    const-string v0, "dateItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lxo1/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    check-cast p2, Lp1/q;

    const v0, -0x52353a8b

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move-object v0, p0

    check-cast v0, Lxo1/c;

    and-int/lit8 v2, p3, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-le v2, v3, :cond_0

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    and-int/lit8 v2, p3, 0x30

    if-ne v2, v3, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, Lui0/q;

    const/16 v2, 0x1a

    invoke-direct {v3, v2, p1, p0}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lc93/a;

    and-int/lit8 p0, p3, 0xe

    invoke-static {v0, v3, p2, p0, v1}, Lxo1/b;->r(Lxo1/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_5
    check-cast p2, Lp1/q;

    const p0, -0x52338356

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lqy0/a;)Ll83/a0;
    .locals 0

    check-cast p1, Lxo1/c;

    invoke-virtual {p1}, Lxo1/c;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c()Lc93/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/n;"
        }
    .end annotation

    sget-object v0, Lwo1/b;->b:Lc93/n;

    return-object v0
.end method
