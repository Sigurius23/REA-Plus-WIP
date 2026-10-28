.class public final Lgb/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgb/p;

.field public final synthetic w:Leb/q;

.field public final synthetic x:Lgb/q;

.field public final synthetic y:Ly1/c;

.field public final synthetic z:Lz1/p;


# direct methods
.method public constructor <init>(Leb/q;Lgb/q;Ly1/d;Lz1/p;Lgb/p;)V
    .locals 0

    iput-object p1, p0, Lgb/l;->w:Leb/q;

    iput-object p2, p0, Lgb/l;->x:Lgb/q;

    iput-object p3, p0, Lgb/l;->y:Ly1/c;

    iput-object p4, p0, Lgb/l;->z:Lz1/p;

    iput-object p5, p0, Lgb/l;->E:Lgb/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    check-cast p1, Lp1/q;

    iget-object p2, p0, Lgb/l;->w:Leb/q;

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lgb/l;->x:Lgb/q;

    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_3

    :cond_2
    new-instance v2, Lb4/g;

    const/4 v0, 0x4

    iget-object v3, p0, Lgb/l;->z:Lz1/p;

    invoke-direct {v2, v3, p2, v1, v0}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v2, p1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    new-instance v0, Lc4/q;

    iget-object v1, p0, Lgb/l;->E:Lgb/p;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p2}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x1da93fb4

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x180

    iget-object v2, p0, Lgb/l;->y:Ly1/c;

    invoke-static {p2, v2, v0, p1, v1}, Ldt/b;->b(Leb/q;Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
