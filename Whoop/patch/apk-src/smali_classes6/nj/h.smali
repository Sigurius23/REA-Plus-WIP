.class public final Lnj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lpj/p;

.field public final synthetic x:J

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Lpj/p;JLandroidx/compose/ui/Modifier;Lc93/a;I)V
    .locals 0

    iput-object p1, p0, Lnj/h;->w:Lpj/p;

    iput-wide p2, p0, Lnj/h;->x:J

    iput-object p4, p0, Lnj/h;->y:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lnj/h;->z:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    const/16 p1, 0x9

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lnj/h;->w:Lpj/p;

    iget-wide v1, p0, Lnj/h;->x:J

    iget-object v3, p0, Lnj/h;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lnj/h;->z:Lc93/a;

    invoke-static/range {v0 .. v6}, Le4/a;->d(Lpj/p;JLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
