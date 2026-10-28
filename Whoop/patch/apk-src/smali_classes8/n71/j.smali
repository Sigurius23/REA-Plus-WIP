.class public final synthetic Ln71/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lo2/e;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lo2/e;Ljava/lang/String;JZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln71/j;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ln71/j;->x:Lo2/e;

    iput-object p3, p0, Ln71/j;->y:Ljava/lang/String;

    iput-wide p4, p0, Ln71/j;->z:J

    iput-boolean p6, p0, Ln71/j;->E:Z

    iput p7, p0, Ln71/j;->F:I

    iput p8, p0, Ln71/j;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Ln71/j;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ln71/j;->x:Lo2/e;

    iget-object v2, p0, Ln71/j;->y:Ljava/lang/String;

    iget-wide v3, p0, Ln71/j;->z:J

    iget-boolean v5, p0, Ln71/j;->E:Z

    iget v6, p0, Ln71/j;->F:I

    iget v7, p0, Ln71/j;->G:I

    invoke-static/range {v0 .. v9}, Ln71/o;->d(Landroidx/compose/ui/Modifier;Lo2/e;Ljava/lang/String;JZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
