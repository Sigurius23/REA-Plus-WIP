.class final Lv41/d0$d;
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
.field final synthetic w:Lbc3/c0;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lh0/a4;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lh0/a4;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lv41/d0$d;->w:Lbc3/c0;

    iput-object p2, p0, Lv41/d0$d;->x:Lp1/c1;

    iput-object p3, p0, Lv41/d0$d;->y:Lh0/a4;

    iput-object p4, p0, Lv41/d0$d;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lv41/d0$d;->b(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 2

    invoke-static {p1}, Lv41/d0;->S(Lp1/c1;)F

    move-result p4

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p4, p4, v0

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-nez p4, :cond_0

    new-instance p1, Lv41/d0$d$b;

    invoke-direct {p1, p2, v1}, Lv41/d0$d$b;-><init>(Lh0/a4;Lq83/d;)V

    invoke-static {p0, v1, v1, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    new-instance p4, Lv41/d0$d$a;

    invoke-direct {p4, p2, p1, v1}, Lv41/d0$d$a;-><init>(Lh0/a4;Lp1/c1;Lq83/d;)V

    invoke-static {p0, v1, v1, p4, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const-wide/16 p0, 0x0

    invoke-static {p3, p0, p1}, Lv41/d0;->V(Lp1/c1;J)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 11
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

    iget-object v0, p0, Lv41/d0$d;->w:Lbc3/c0;

    iget-object v1, p0, Lv41/d0$d;->x:Lp1/c1;

    iget-object v2, p0, Lv41/d0$d;->y:Lh0/a4;

    iget-object v3, p0, Lv41/d0$d;->z:Lp1/c1;

    new-instance v5, Lv41/e0;

    invoke-direct {v5, v0, v1, v2, v3}, Lv41/e0;-><init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V

    const/4 v8, 0x0

    const/16 v10, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    move-object v9, p2

    invoke-static/range {v4 .. v10}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
