.class public final synthetic Liz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Z

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ll3/g;

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JLkotlin/jvm/functions/Function1;IIIZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz0/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Liz0/e;->x:Ll3/g;

    iput-object p3, p0, Liz0/e;->y:Ll3/v0;

    iput-wide p4, p0, Liz0/e;->z:J

    iput-object p6, p0, Liz0/e;->E:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Liz0/e;->F:I

    iput p8, p0, Liz0/e;->G:I

    iput p9, p0, Liz0/e;->H:I

    iput-boolean p10, p0, Liz0/e;->I:Z

    iput p11, p0, Liz0/e;->J:I

    iput p12, p0, Liz0/e;->K:I

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

    iget-object v0, p0, Liz0/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Liz0/e;->x:Ll3/g;

    iget-object v2, p0, Liz0/e;->y:Ll3/v0;

    iget-wide v3, p0, Liz0/e;->z:J

    iget-object v5, p0, Liz0/e;->E:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Liz0/e;->F:I

    iget v7, p0, Liz0/e;->G:I

    iget v8, p0, Liz0/e;->H:I

    iget-boolean v9, p0, Liz0/e;->I:Z

    iget v10, p0, Liz0/e;->J:I

    iget v11, p0, Liz0/e;->K:I

    invoke-static/range {v0 .. v13}, Liz0/g;->l(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JLkotlin/jvm/functions/Function1;IIIZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
