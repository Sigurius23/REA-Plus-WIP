.class public final synthetic Lhy0/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Float;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:Lb91/c;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lhy0/g;

.field public final synthetic y:Lhy0/f;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/f2;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/f2;->x:Lhy0/g;

    iput-object p3, p0, Lhy0/f2;->y:Lhy0/f;

    iput-object p4, p0, Lhy0/f2;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lhy0/f2;->E:Ljava/lang/Float;

    iput-wide p6, p0, Lhy0/f2;->F:J

    iput-wide p8, p0, Lhy0/f2;->G:J

    iput-object p10, p0, Lhy0/f2;->H:Lb91/c;

    iput p11, p0, Lhy0/f2;->I:I

    iput p12, p0, Lhy0/f2;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lhy0/f2;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lhy0/f2;->x:Lhy0/g;

    iget-object v2, p0, Lhy0/f2;->y:Lhy0/f;

    iget-object v3, p0, Lhy0/f2;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lhy0/f2;->E:Ljava/lang/Float;

    iget-wide v5, p0, Lhy0/f2;->F:J

    iget-wide v7, p0, Lhy0/f2;->G:J

    iget-object v9, p0, Lhy0/f2;->H:Lb91/c;

    iget v10, p0, Lhy0/f2;->I:I

    iget v11, p0, Lhy0/f2;->J:I

    invoke-static/range {v0 .. v13}, Lhy0/i2;->e(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
