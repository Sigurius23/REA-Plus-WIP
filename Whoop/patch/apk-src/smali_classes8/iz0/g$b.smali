.class final Liz0/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liz0/g;->G0(Landroidx/compose/ui/Modifier;Ll3/g;Lc93/a;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
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
.field final synthetic w:Z

.field final synthetic x:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic y:Ll3/g;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLc93/a;Ll3/g;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Ll3/g;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Liz0/g$b;->w:Z

    iput-object p2, p0, Liz0/g$b;->x:Lc93/a;

    iput-object p3, p0, Liz0/g$b;->y:Ll3/g;

    iput-object p4, p0, Liz0/g$b;->z:Lkotlin/jvm/functions/Function1;

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

    new-instance v0, Liz0/g$b$a;

    iget-boolean v1, p0, Liz0/g$b;->w:Z

    iget-object v2, p0, Liz0/g$b;->x:Lc93/a;

    iget-object v3, p0, Liz0/g$b;->y:Ll3/g;

    iget-object v4, p0, Liz0/g$b;->z:Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Liz0/g$b$a;-><init>(ZLc93/a;Ll3/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    check-cast p1, Lu2/h0;

    invoke-virtual {p1, v0, p2}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
