.class public final synthetic Lm41/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lb91/c;

.field public final synthetic y:J

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(ILb91/c;JLandroidx/compose/ui/Modifier;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm41/d;->w:I

    iput-object p2, p0, Lm41/d;->x:Lb91/c;

    iput-wide p3, p0, Lm41/d;->y:J

    iput-object p5, p0, Lm41/d;->z:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lm41/d;->E:I

    iput p7, p0, Lm41/d;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Lm41/d;->w:I

    iget-object v1, p0, Lm41/d;->x:Lb91/c;

    iget-wide v2, p0, Lm41/d;->y:J

    iget-object v4, p0, Lm41/d;->z:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lm41/d;->E:I

    iget v6, p0, Lm41/d;->F:I

    invoke-static/range {v0 .. v8}, Lm41/e;->e(ILb91/c;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
