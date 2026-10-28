.class public final Lnj/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lpj/p;

.field public final synthetic x:J

.field public final synthetic y:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Lpj/p;JLandroidx/compose/ui/Modifier;I)V
    .locals 0

    iput-object p1, p0, Lnj/e;->w:Lpj/p;

    iput-wide p2, p0, Lnj/e;->x:J

    iput-object p4, p0, Lnj/e;->y:Landroidx/compose/ui/Modifier;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    const/16 p1, 0x9

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v0, p0, Lnj/e;->w:Lpj/p;

    iget-wide v1, p0, Lnj/e;->x:J

    iget-object v3, p0, Lnj/e;->y:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v5}, Le4/a;->b(Lpj/p;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
