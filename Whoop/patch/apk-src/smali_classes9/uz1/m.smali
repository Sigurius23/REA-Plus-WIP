.class public final synthetic Luz1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIIILandroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Luz1/m;->w:I

    iput p2, p0, Luz1/m;->x:I

    iput-object p5, p0, Luz1/m;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Luz1/m;->z:I

    iput p4, p0, Luz1/m;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Luz1/m;->w:I

    iget v1, p0, Luz1/m;->x:I

    iget-object v2, p0, Luz1/m;->y:Landroidx/compose/ui/Modifier;

    iget v3, p0, Luz1/m;->z:I

    iget v4, p0, Luz1/m;->E:I

    invoke-static/range {v0 .. v6}, Luz1/n;->f(IILandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
