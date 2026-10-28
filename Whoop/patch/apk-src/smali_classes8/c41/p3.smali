.class public final synthetic Lc41/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:J

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:J

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:I

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILcom/whoop/design/util/TextResource;IJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/p3;->w:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lc41/p3;->x:I

    iput-object p3, p0, Lc41/p3;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lc41/p3;->z:I

    iput-wide p5, p0, Lc41/p3;->E:J

    iput-object p7, p0, Lc41/p3;->F:Lcom/whoop/design/util/TextResource;

    iput-wide p8, p0, Lc41/p3;->G:J

    iput-object p10, p0, Lc41/p3;->H:Lcom/whoop/design/util/TextResource;

    iput-wide p11, p0, Lc41/p3;->I:J

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

    iget-object v0, p0, Lc41/p3;->w:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lc41/p3;->x:I

    iget-object v2, p0, Lc41/p3;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lc41/p3;->z:I

    iget-wide v4, p0, Lc41/p3;->E:J

    iget-object v6, p0, Lc41/p3;->F:Lcom/whoop/design/util/TextResource;

    iget-wide v7, p0, Lc41/p3;->G:J

    iget-object v9, p0, Lc41/p3;->H:Lcom/whoop/design/util/TextResource;

    iget-wide v10, p0, Lc41/p3;->I:J

    invoke-static/range {v0 .. v13}, Lc41/u3;->a(Lkotlin/jvm/functions/Function1;ILcom/whoop/design/util/TextResource;IJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
