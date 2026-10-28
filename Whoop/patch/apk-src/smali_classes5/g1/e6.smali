.class public final Lg1/e6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Lh0/n1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:F

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(ZFLp1/c1;Lp1/t2;Lbc3/c0;Lh0/n1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/e6;->w:Z

    iput p2, p0, Lg1/e6;->x:F

    iput-object p3, p0, Lg1/e6;->y:Lp1/c1;

    iput-object p4, p0, Lg1/e6;->z:Lp1/t2;

    iput-object p5, p0, Lg1/e6;->E:Lbc3/c0;

    iput-object p6, p0, Lg1/e6;->F:Lh0/n1;

    iput-object p7, p0, Lg1/e6;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lg1/d6;

    iget-object v4, p0, Lg1/e6;->z:Lp1/t2;

    const/4 v5, 0x0

    iget-boolean v1, p0, Lg1/e6;->w:Z

    iget v2, p0, Lg1/e6;->x:F

    iget-object v3, p0, Lg1/e6;->y:Lp1/c1;

    invoke-direct/range {v0 .. v5}, Lg1/d6;-><init>(ZFLp1/c1;Lp1/t2;Lq83/d;)V

    new-instance v4, Lep1/g;

    const/16 v1, 0xe

    iget-object v2, p0, Lg1/e6;->E:Lbc3/c0;

    iget-object v3, p0, Lg1/e6;->F:Lh0/n1;

    iget-object v5, p0, Lg1/e6;->G:Lp1/c1;

    invoke-direct {v4, v2, v3, v5, v1}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v6, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p2

    move-object v3, v0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
