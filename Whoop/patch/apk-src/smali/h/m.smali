.class public final Lh/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lc93/m;


# direct methods
.method public constructor <init>(ZLc93/m;I)V
    .locals 0

    iput-boolean p1, p0, Lh/m;->w:Z

    iput-object p2, p0, Lh/m;->x:Lc93/m;

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

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lh/m;->w:Z

    iget-object v1, p0, Lh/m;->x:Lc93/m;

    invoke-static {v0, v1, p1, p2}, Landroidx/room/c1;->c(ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
