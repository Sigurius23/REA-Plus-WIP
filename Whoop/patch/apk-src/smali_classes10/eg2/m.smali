.class public final synthetic Leg2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/Modifier;JJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Leg2/m;->w:I

    iput-object p2, p0, Leg2/m;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Leg2/m;->y:J

    iput-wide p5, p0, Leg2/m;->z:J

    iput p7, p0, Leg2/m;->E:I

    iput p8, p0, Leg2/m;->F:I

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

    iget v0, p0, Leg2/m;->w:I

    iget-object v1, p0, Leg2/m;->x:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Leg2/m;->y:J

    iget-wide v4, p0, Leg2/m;->z:J

    iget v6, p0, Leg2/m;->E:I

    iget v7, p0, Leg2/m;->F:I

    invoke-static/range {v0 .. v9}, Leg2/n;->b(ILandroidx/compose/ui/Modifier;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
