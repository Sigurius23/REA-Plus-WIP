.class public final synthetic Lsy0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:J

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Z

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsy0/n;->w:Z

    iput-object p2, p0, Lsy0/n;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lsy0/n;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lsy0/n;->z:Landroidx/compose/ui/Modifier;

    iput-boolean p5, p0, Lsy0/n;->E:Z

    iput-boolean p6, p0, Lsy0/n;->F:Z

    iput-wide p7, p0, Lsy0/n;->G:J

    iput p9, p0, Lsy0/n;->H:I

    iput p10, p0, Lsy0/n;->I:I

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

    iget-boolean v0, p0, Lsy0/n;->w:Z

    iget-object v1, p0, Lsy0/n;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lsy0/n;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsy0/n;->z:Landroidx/compose/ui/Modifier;

    iget-boolean v4, p0, Lsy0/n;->E:Z

    iget-boolean v5, p0, Lsy0/n;->F:Z

    iget-wide v6, p0, Lsy0/n;->G:J

    iget v8, p0, Lsy0/n;->H:I

    iget v9, p0, Lsy0/n;->I:I

    invoke-static/range {v0 .. v11}, Lsy0/o;->c(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
