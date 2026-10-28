.class final Ln31/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln31/b;->C(Landroidx/compose/ui/Modifier;Lg2/i;)Landroidx/compose/ui/Modifier;
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

    iput-object p1, p0, Ln31/b$d;->w:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    move-object v0, p1

    check-cast v0, Lu2/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Z:Lb3/j3;

    invoke-interface {v0}, Lb3/j3;->g()F

    move-result v0

    new-instance v1, Ln31/b$d$a;

    iget-object v2, p0, Ln31/b$d;->w:Lg2/i;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Ln31/b$d$a;-><init>(FLg2/i;Lq83/d;)V

    invoke-static {p1, v1, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
