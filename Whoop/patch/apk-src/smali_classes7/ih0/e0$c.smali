.class final Lih0/e0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lih0/e0;->j0(Landroidx/compose/ui/Modifier;Lah0/c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic x:Lah0/c;


# direct methods
.method public constructor <init>(Lp1/t2;Lah0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lah0/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lih0/e0$c;->w:Lp1/t2;

    iput-object p2, p0, Lih0/e0$c;->x:Lah0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/t2;Lah0/c;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lih0/e0$c;->b(Lp1/t2;Lah0/c;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lp1/t2;Lah0/c;Lh2/b;)Ll83/a0;
    .locals 2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    new-instance p2, Lih0/b$a;

    invoke-virtual {p1}, Lah0/c;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lah0/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lah0/c;->w()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, v0, v1, p1}, Lih0/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    iget-object v0, p0, Lih0/e0$c;->w:Lp1/t2;

    iget-object v1, p0, Lih0/e0$c;->x:Lah0/c;

    new-instance v6, Lih0/f0;

    const/4 v2, 0x0

    invoke-direct {v6, v2, v0, v1}, Lih0/f0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v7, p2

    invoke-static/range {v2 .. v8}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
