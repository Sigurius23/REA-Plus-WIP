.class public final synthetic Ln21/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgz0/m0;

.field public final synthetic F:J

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lb91/c;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Li91/a;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ln21/i;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLkotlin/jvm/functions/Function1;Lb91/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln21/f;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ln21/f;->x:Li91/a;

    iput-object p3, p0, Ln21/f;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Ln21/f;->z:Ln21/i;

    iput-object p5, p0, Ln21/f;->E:Lgz0/m0;

    iput-wide p6, p0, Ln21/f;->F:J

    iput-object p8, p0, Ln21/f;->G:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Ln21/f;->H:Lb91/c;

    iput p10, p0, Ln21/f;->I:I

    iput p11, p0, Ln21/f;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Ln21/f;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ln21/f;->x:Li91/a;

    iget-object v2, p0, Ln21/f;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Ln21/f;->z:Ln21/i;

    iget-object v4, p0, Ln21/f;->E:Lgz0/m0;

    iget-wide v5, p0, Ln21/f;->F:J

    iget-object v7, p0, Ln21/f;->G:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Ln21/f;->H:Lb91/c;

    iget v9, p0, Ln21/f;->I:I

    iget v10, p0, Ln21/f;->J:I

    invoke-static/range {v0 .. v12}, Ln21/h;->e(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLkotlin/jvm/functions/Function1;Lb91/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
