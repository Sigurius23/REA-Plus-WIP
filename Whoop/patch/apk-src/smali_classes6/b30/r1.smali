.class public final synthetic Lb30/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZZLld0/n;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb30/r1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/r1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb30/r1;->y:Ljava/lang/Object;

    iput-wide p3, p0, Lb30/r1;->z:J

    iput-boolean p5, p0, Lb30/r1;->E:Z

    iput-boolean p6, p0, Lb30/r1;->F:Z

    iput-object p7, p0, Lb30/r1;->I:Ljava/lang/Object;

    iput p8, p0, Lb30/r1;->G:I

    iput p9, p0, Lb30/r1;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lb30/r1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/r1;->I:Ljava/lang/Object;

    iput-object p2, p0, Lb30/r1;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/r1;->E:Z

    iput-boolean p4, p0, Lb30/r1;->F:Z

    iput-wide p5, p0, Lb30/r1;->z:J

    iput-object p7, p0, Lb30/r1;->x:Ljava/lang/Object;

    iput p8, p0, Lb30/r1;->G:I

    iput p9, p0, Lb30/r1;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZII)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lb30/r1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/r1;->I:Ljava/lang/Object;

    iput-object p2, p0, Lb30/r1;->y:Ljava/lang/Object;

    iput-wide p3, p0, Lb30/r1;->z:J

    iput-object p5, p0, Lb30/r1;->x:Ljava/lang/Object;

    iput-boolean p6, p0, Lb30/r1;->E:Z

    iput-boolean p7, p0, Lb30/r1;->F:Z

    iput p8, p0, Lb30/r1;->G:I

    iput p9, p0, Lb30/r1;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lb30/r1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/r1;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lb30/r1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsy0/k;

    iget-object v0, p0, Lb30/r1;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-boolean v3, p0, Lb30/r1;->E:Z

    iget-boolean v4, p0, Lb30/r1;->F:Z

    iget-wide v5, p0, Lb30/r1;->z:J

    iget v8, p0, Lb30/r1;->G:I

    iget v9, p0, Lb30/r1;->H:I

    invoke-static/range {v1 .. v11}, Lsy0/p;->a(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/r1;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb30/r1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lb30/r1;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lld0/n;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-wide v3, p0, Lb30/r1;->z:J

    iget-boolean v5, p0, Lb30/r1;->E:Z

    iget-boolean v6, p0, Lb30/r1;->F:Z

    iget v8, p0, Lb30/r1;->G:I

    iget v9, p0, Lb30/r1;->H:I

    invoke-static/range {v1 .. v11}, Llf0/b0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZZLld0/n;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/r1;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    iget-object v0, p0, Lb30/r1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lb30/r1;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/r1;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-wide v3, p0, Lb30/r1;->z:J

    iget-boolean v6, p0, Lb30/r1;->E:Z

    iget-boolean v7, p0, Lb30/r1;->F:Z

    iget v10, p0, Lb30/r1;->H:I

    invoke-static/range {v1 .. v10}, Lo73/a;->g(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
