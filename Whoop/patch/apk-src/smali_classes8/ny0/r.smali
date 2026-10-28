.class public final synthetic Lny0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ly71/g;JZZLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lny0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/r;->H:Ljava/lang/Object;

    iput-wide p2, p0, Lny0/r;->E:J

    iput-boolean p4, p0, Lny0/r;->x:Z

    iput-boolean p5, p0, Lny0/r;->z:Z

    iput-object p6, p0, Lny0/r;->y:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lny0/r;->F:I

    iput p8, p0, Lny0/r;->G:I

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lny0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lny0/r;->x:Z

    iput-object p2, p0, Lny0/r;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Lny0/r;->z:Z

    iput-wide p4, p0, Lny0/r;->E:J

    iput-object p6, p0, Lny0/r;->H:Ljava/lang/Object;

    iput p7, p0, Lny0/r;->F:I

    iput p8, p0, Lny0/r;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lny0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lny0/r;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/Modifier;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v1, p0, Lny0/r;->x:Z

    iget-object v2, p0, Lny0/r;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lny0/r;->z:Z

    iget-wide v4, p0, Lny0/r;->E:J

    iget v7, p0, Lny0/r;->F:I

    iget v8, p0, Lny0/r;->G:I

    invoke-static/range {v1 .. v10}, Lsy0/j;->c(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lny0/r;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly71/g;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-wide v2, p0, Lny0/r;->E:J

    iget-boolean v4, p0, Lny0/r;->x:Z

    iget-boolean v5, p0, Lny0/r;->z:Z

    iget-object v6, p0, Lny0/r;->y:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lny0/r;->F:I

    iget v8, p0, Lny0/r;->G:I

    invoke-static/range {v1 .. v10}, Lny0/s;->a(Ly71/g;JZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
