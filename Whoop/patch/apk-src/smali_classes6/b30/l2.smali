.class public final Lb30/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li2/y;

.field public final synthetic y:Lb2/m;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb30/l2;->w:I

    iput-object p2, p0, Lb30/l2;->x:Li2/y;

    iput-object p3, p0, Lb30/l2;->y:Lb2/m;

    iput-object p4, p0, Lb30/l2;->z:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v3, p0, Lb30/l2;->z:Landroidx/compose/ui/Modifier;

    const/16 v5, 0xc00

    iget v0, p0, Lb30/l2;->w:I

    iget-object v1, p0, Lb30/l2;->x:Li2/y;

    iget-object v2, p0, Lb30/l2;->y:Lb2/m;

    invoke-static/range {v0 .. v5}, Ldc/a;->j(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
