.class public final Lrj/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/internal/m;

.field public final synthetic z:Luj/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    iput-object p1, p0, Lrj/l;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lrj/l;->x:Z

    check-cast p3, Lkotlin/jvm/internal/m;

    iput-object p3, p0, Lrj/l;->y:Lkotlin/jvm/internal/m;

    iput-object p4, p0, Lrj/l;->z:Luj/i;

    iput-object p5, p0, Lrj/l;->E:Landroidx/compose/ui/Modifier;

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

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lrj/l;->w:Ljava/lang/String;

    iget-boolean v1, p0, Lrj/l;->x:Z

    iget-object v2, p0, Lrj/l;->y:Lkotlin/jvm/internal/m;

    iget-object v3, p0, Lrj/l;->z:Luj/i;

    iget-object v4, p0, Lrj/l;->E:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v6}, Lrj/o;->c(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
