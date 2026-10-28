.class final Lzq0/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/f;->b0(Landroidx/compose/ui/Modifier;Lcom/whoop/navigation/models/GenericInteraction;Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lc93/a;)Landroidx/compose/ui/Modifier;
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
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lcom/whoop/navigation/models/GenericInteraction;

.field final synthetic G:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic w:Lzq0/p;

.field final synthetic x:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic y:F

.field final synthetic z:F


# direct methods
.method public constructor <init>(Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq0/p;",
            "Lc93/a;",
            "FF",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzq0/f$h;->w:Lzq0/p;

    iput-object p2, p0, Lzq0/f$h;->x:Lc93/a;

    iput p3, p0, Lzq0/f$h;->y:F

    iput p4, p0, Lzq0/f$h;->z:F

    iput-object p5, p0, Lzq0/f$h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lzq0/f$h;->F:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p7, p0, Lzq0/f$h;->G:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    new-instance v0, Lzq0/f$h$a;

    iget-object v1, p0, Lzq0/f$h;->w:Lzq0/p;

    iget-object v2, p0, Lzq0/f$h;->x:Lc93/a;

    iget v3, p0, Lzq0/f$h;->y:F

    iget v4, p0, Lzq0/f$h;->z:F

    iget-object v5, p0, Lzq0/f$h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lzq0/f$h;->F:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lzq0/f$h;->G:Lc93/a;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lzq0/f$h$a;-><init>(Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lc93/a;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
