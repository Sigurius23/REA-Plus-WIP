.class final Lis0/j0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/j0;->B0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
.field public static final w:Lis0/j0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lis0/j0$g;

    invoke-direct {v0}, Lis0/j0$g;-><init>()V

    sput-object v0, Lis0/j0$g;->w:Lis0/j0$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0$g;->b(Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lu2/r;F)Ll83/a0;
    .locals 0

    const-string p1, "change"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu2/r;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v3, Lis0/l0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lh0/z0;->h(Lu2/v;Lc93/a;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
