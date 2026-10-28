.class final Lj31/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/h;->b(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;
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
.field final synthetic w:Lj31/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj31/m<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj31/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/m<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/h$b;->w:Lj31/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    new-instance v0, Lj31/h$b$a;

    iget-object v1, p0, Lj31/h$b;->w:Lj31/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj31/h$b$a;-><init>(Lj31/m;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lh0/q3;->m(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
