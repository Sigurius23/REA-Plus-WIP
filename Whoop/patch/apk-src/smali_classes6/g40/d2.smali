.class public final Lg40/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lg2/s;

.field public final synthetic G:I

.field public final synthetic w:Z

.field public final synthetic x:Lg40/z1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZLg2/s;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg40/d2;->w:Z

    iput-object p2, p0, Lg40/d2;->x:Lg40/z1;

    iput-object p3, p0, Lg40/d2;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lg40/d2;->z:Lc93/m;

    iput-boolean p5, p0, Lg40/d2;->E:Z

    iput-object p6, p0, Lg40/d2;->F:Lg2/s;

    iput p7, p0, Lg40/d2;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v9

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
    const/4 v10, 0x0

    const/16 v11, 0x80

    iget-boolean v0, p0, Lg40/d2;->w:Z

    iget-object v1, p0, Lg40/d2;->x:Lg40/z1;

    iget-object v2, p0, Lg40/d2;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lg40/d2;->z:Lc93/m;

    iget-boolean v4, p0, Lg40/d2;->E:Z

    const/4 v5, 0x0

    iget-object v6, p0, Lg40/d2;->F:Lg2/s;

    const/4 v7, 0x0

    iget v8, p0, Lg40/d2;->G:I

    invoke-static/range {v0 .. v11}, Ldp/d;->g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
