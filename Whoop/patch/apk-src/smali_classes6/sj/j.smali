.class public final Lsj/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lsj/l;

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public constructor <init>(Lsj/l;III)V
    .locals 0

    iput-object p1, p0, Lsj/j;->w:Lsj/l;

    iput p2, p0, Lsj/j;->x:I

    iput p4, p0, Lsj/j;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    const/16 p2, 0x41

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lsj/j;->y:I

    iget-object v1, p0, Lsj/j;->w:Lsj/l;

    iget v2, p0, Lsj/j;->x:I

    invoke-virtual {v1, v2, p2, p1, v0}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
