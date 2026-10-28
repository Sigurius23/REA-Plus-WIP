.class public final Lgb/c0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Ly1/c;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/t2;


# direct methods
.method public constructor <init>(Ly1/d;Lp1/c1;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lgb/c0;->w:Ly1/c;

    iput-object p2, p0, Lgb/c0;->x:Lp1/c1;

    iput-object p3, p0, Lgb/c0;->y:Lp1/t2;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    iget-object p4, p0, Lgb/c0;->x:Lp1/c1;

    invoke-interface {p4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lgb/c0;->y:Lp1/t2;

    invoke-interface {p4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    :cond_1
    invoke-interface {p4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Leb/q;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    move-object p2, v0

    check-cast p2, Leb/q;

    :goto_1
    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    new-instance p4, La3/n1;

    const/4 v0, 0x4

    invoke-direct {p4, v0, p2, p1}, La3/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, -0x4b4ff5b3

    invoke-static {p1, p3, p4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 p4, 0x180

    iget-object v0, p0, Lgb/c0;->w:Ly1/c;

    invoke-static {p2, v0, p1, p3, p4}, Ldt/b;->b(Leb/q;Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
