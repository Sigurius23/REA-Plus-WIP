.class final Le81/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le81/d0;->U(Landroidx/compose/ui/Modifier;Le81/r;Ljava/util/List;Le81/u;Lq2/a;FFFLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
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

.field final synthetic F:Lq2/a;

.field final synthetic G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic H:F

.field final synthetic w:Le81/r;

.field final synthetic x:F

.field final synthetic y:F

.field final synthetic z:Le81/u;


# direct methods
.method public constructor <init>(Le81/r;FFLe81/u;Lkotlin/jvm/functions/Function1;Lq2/a;Ljava/util/List;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/r;",
            "FF",
            "Le81/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq2/a;",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;F)V"
        }
    .end annotation

    iput-object p1, p0, Le81/d0$b;->w:Le81/r;

    iput p2, p0, Le81/d0$b;->x:F

    iput p3, p0, Le81/d0$b;->y:F

    iput-object p4, p0, Le81/d0$b;->z:Le81/u;

    iput-object p5, p0, Le81/d0$b;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Le81/d0$b;->F:Lq2/a;

    iput-object p7, p0, Le81/d0$b;->G:Ljava/util/List;

    iput p8, p0, Le81/d0$b;->H:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    new-instance v0, Le81/d0$b$a;

    iget-object v1, p0, Le81/d0$b;->w:Le81/r;

    iget v2, p0, Le81/d0$b;->x:F

    iget v3, p0, Le81/d0$b;->y:F

    iget-object v4, p0, Le81/d0$b;->z:Le81/u;

    iget-object v5, p0, Le81/d0$b;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Le81/d0$b;->F:Lq2/a;

    iget-object v7, p0, Le81/d0$b;->G:Ljava/util/List;

    iget v8, p0, Le81/d0$b;->H:F

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v9}, Le81/d0$b$a;-><init>(Le81/r;FFLe81/u;Lkotlin/jvm/functions/Function1;Lq2/a;Ljava/util/List;FLq83/d;)V

    invoke-static {p1, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
