.class public final Lgb/s;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ly1/c;

.field public final synthetic x:Lx1/b;

.field public final synthetic y:I


# direct methods
.method public constructor <init>(Ly1/c;Lx1/b;I)V
    .locals 0

    iput-object p1, p0, Lgb/s;->w:Ly1/c;

    iput-object p2, p0, Lgb/s;->x:Lx1/b;

    iput p3, p0, Lgb/s;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p2, p0, Lgb/s;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lgb/s;->w:Ly1/c;

    iget-object v1, p0, Lgb/s;->x:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Ldt/b;->e(Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
