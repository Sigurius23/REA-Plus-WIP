.class public final Lyd2/a;
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
.field public static final a:Lyd2/a;

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

    new-instance v0, Lyd2/a;

    invoke-direct {v0}, Lyd2/a;-><init>()V

    sput-object v0, Lyd2/a;->a:Lyd2/a;

    new-instance v0, Lvx0/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lvx0/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x4f5b1d06

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lyd2/a;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyd2/a;->c(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p0, p2, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v0, :cond_0

    move p0, v2

    goto :goto_0

    :cond_0
    move p0, v1

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {p1, v1}, Lyd2/d;->x(Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
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

    sget-object v0, Lyd2/a;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
