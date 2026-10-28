.class public final synthetic Lc41/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc41/f2;

.field public final synthetic F:J

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Z

.field public final synthetic x:I

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;JLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lc41/b2;->w:Z

    iput p2, p0, Lc41/b2;->x:I

    iput-object p3, p0, Lc41/b2;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lc41/b2;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lc41/b2;->E:Lc41/f2;

    iput-wide p6, p0, Lc41/b2;->F:J

    iput-object p8, p0, Lc41/b2;->G:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lc41/b2;->H:I

    iput p10, p0, Lc41/b2;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-boolean v0, p0, Lc41/b2;->w:Z

    iget v1, p0, Lc41/b2;->x:I

    iget-object v2, p0, Lc41/b2;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lc41/b2;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lc41/b2;->E:Lc41/f2;

    iget-wide v5, p0, Lc41/b2;->F:J

    iget-object v7, p0, Lc41/b2;->G:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lc41/b2;->H:I

    iget v9, p0, Lc41/b2;->I:I

    invoke-static/range {v0 .. v11}, Lc41/c2;->a(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
