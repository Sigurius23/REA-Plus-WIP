.class final Lv41/d0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/d0;->J(Landroidx/compose/ui/Modifier;FFZLkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:F

.field final synthetic x:F

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(FFLp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput p1, p0, Lv41/d0$e;->w:F

    iput p2, p0, Lv41/d0$e;->x:F

    iput-object p3, p0, Lv41/d0$e;->y:Lp1/c1;

    iput-object p4, p0, Lv41/d0$e;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    new-instance v0, Lv41/d0$e$a;

    iget v1, p0, Lv41/d0$e;->w:F

    iget v2, p0, Lv41/d0$e;->x:F

    iget-object v3, p0, Lv41/d0$e;->y:Lp1/c1;

    iget-object v4, p0, Lv41/d0$e;->z:Lp1/c1;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lv41/d0$e$a;-><init>(FFLp1/c1;Lp1/c1;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
