.class final Lat2/c0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lat2/c0;->w(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lys2/e$j;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lv41/f$a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lys2/e$j;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lys2/e$j;",
            "Lbc3/c0;",
            "Lv41/f$a;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lat2/c0$d;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lat2/c0$d;->x:Lys2/e$j;

    iput-object p3, p0, Lat2/c0$d;->y:Lbc3/c0;

    iput-object p4, p0, Lat2/c0$d;->z:Lv41/f$a;

    iput-object p5, p0, Lat2/c0$d;->E:Lp1/c1;

    iput-object p6, p0, Lat2/c0$d;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lf41/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lat2/c0$d;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lws2/i$l;

    iget-object v2, p0, Lat2/c0$d;->x:Lys2/e$j;

    invoke-virtual {v2}, Lys2/e$j;->k()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lf41/r;

    move-object v4, v3

    invoke-virtual {v4}, Lf41/r;->a()Ljava/lang/String;

    move-result-object v3

    move-object v5, v4

    invoke-virtual {v5}, Lf41/r;->d()Z

    move-result v4

    move-object v6, v5

    invoke-virtual {v6}, Lf41/r;->c()Z

    move-result v5

    invoke-virtual {v6}, Lf41/r;->b()I

    move-result v6

    invoke-direct/range {v1 .. v6}, Lws2/i$l;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ZZI)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p1, Lf41/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lat2/c0$d;->y:Lbc3/c0;

    new-instance v1, Lat2/c0$d$a;

    iget-object v3, p0, Lat2/c0$d;->z:Lv41/f$a;

    iget-object v4, p0, Lat2/c0$d;->E:Lp1/c1;

    iget-object v5, p0, Lat2/c0$d;->F:Lp1/c1;

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lat2/c0$d$a;-><init>(Ljava/lang/Object;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lat2/c0$d;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
