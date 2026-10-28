.class final Luw0/l$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luw0/l;->C(Landroidx/compose/ui/Modifier;Lkm0/e;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg2/i;Landroidx/compose/runtime/Composer;II)V
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


# instance fields
.field final synthetic w:Lg2/i;


# direct methods
.method public constructor <init>(Lg2/i;)V
    .locals 0

    iput-object p1, p0, Luw0/l$i;->w:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg2/i;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Luw0/l$i;->b(Lg2/i;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lg2/i;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    iget-object v0, p0, Luw0/l$i;->w:Lg2/i;

    new-instance v5, Luw0/m;

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Luw0/m;-><init>(Ljava/lang/Object;I)V

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v6, p2

    invoke-static/range {v1 .. v7}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
