.class final Lis0/x$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/x;->o(Landroidx/compose/ui/Modifier;Lis0/s0;Lis0/j;Lis0/m0;Lis0/a0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field public static final w:Lis0/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lis0/x$b;

    invoke-direct {v0}, Lis0/x$b;-><init>()V

    sput-object v0, Lis0/x$b;->w:Lis0/x$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/x$b;->b(Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lh2/b;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    new-instance v4, Lis0/y;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lis0/y;-><init>(I)V

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v5, p2

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
