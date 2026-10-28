.class public final synthetic Lj1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lj1/l;

.field public final synthetic x:J

.field public final synthetic y:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lj1/l;JLandroidx/compose/ui/Modifier;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/e;->w:Lj1/l;

    iput-wide p2, p0, Lj1/e;->x:J

    iput-object p4, p0, Lj1/e;->y:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x181

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v0, p0, Lj1/e;->w:Lj1/l;

    iget-wide v1, p0, Lj1/e;->x:J

    iget-object v3, p0, Lj1/e;->y:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v5}, Lj1/g;->a(Lj1/l;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
