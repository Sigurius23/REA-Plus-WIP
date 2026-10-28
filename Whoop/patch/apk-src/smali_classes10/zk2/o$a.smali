.class final Lzk2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzk2/o;->h(Lw41/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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
.field public static final w:Lzk2/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk2/o$a;

    invoke-direct {v0}, Lzk2/o$a;-><init>()V

    sput-object v0, Lzk2/o$a;->w:Lzk2/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lu2/r;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzk2/o$a;->b(Lu2/r;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lu2/r;Lh2/b;)Ll83/a0;
    .locals 0

    const-string p1, "change"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu2/r;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    new-instance v0, Lzk2/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0, p2}, Lh0/z0;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
