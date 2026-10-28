.class public final synthetic Lcw2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JII)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, Lcw2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw2/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Lcw2/c;->E:Ljava/lang/Object;

    iput-object p3, p0, Lcw2/c;->F:Ljava/lang/Object;

    iput-wide p4, p0, Lcw2/c;->x:J

    iput p6, p0, Lcw2/c;->y:I

    iput p7, p0, Lcw2/c;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 2
    iput p8, p0, Lcw2/c;->w:I

    iput-object p1, p0, Lcw2/c;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lcw2/c;->x:J

    iput-object p4, p0, Lcw2/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Lcw2/c;->G:Ljava/lang/Object;

    iput p6, p0, Lcw2/c;->y:I

    iput p7, p0, Lcw2/c;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lcw2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw2/c;->E:Ljava/lang/Object;

    iput-object p2, p0, Lcw2/c;->F:Ljava/lang/Object;

    iput-wide p3, p0, Lcw2/c;->x:J

    iput-object p5, p0, Lcw2/c;->G:Ljava/lang/Object;

    iput p6, p0, Lcw2/c;->y:I

    iput p7, p0, Lcw2/c;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ln6/o;IJLjava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 4
    const/4 v0, 0x2

    iput v0, p0, Lcw2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw2/c;->G:Ljava/lang/Object;

    iput p2, p0, Lcw2/c;->y:I

    iput-wide p3, p0, Lcw2/c;->x:J

    iput-object p5, p0, Lcw2/c;->E:Ljava/lang/Object;

    iput-object p6, p0, Lcw2/c;->F:Ljava/lang/Object;

    iput p7, p0, Lcw2/c;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JII)V
    .locals 1

    .line 5
    const/4 v0, 0x4

    iput v0, p0, Lcw2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw2/c;->E:Ljava/lang/Object;

    iput-object p2, p0, Lcw2/c;->G:Ljava/lang/Object;

    iput-object p3, p0, Lcw2/c;->F:Ljava/lang/Object;

    iput-wide p4, p0, Lcw2/c;->x:J

    iput p6, p0, Lcw2/c;->y:I

    iput p7, p0, Lcw2/c;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lcw2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ll3/g;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll3/v0;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v4, p0, Lcw2/c;->x:J

    iget v6, p0, Lcw2/c;->y:I

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Lsl0/l2;->e(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsk1/b;

    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb91/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v4, p0, Lcw2/c;->x:J

    iget v6, p0, Lcw2/c;->y:I

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Lsk1/a;->a(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Lcw2/c;->x:J

    iget v6, p0, Lcw2/c;->y:I

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Lqq2/b;->c(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln6/o;

    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lcw2/c;->y:I

    iget-wide v3, p0, Lcw2/c;->x:J

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Lk03/n;->e(Ln6/o;IJLjava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Lcw2/c;->x:J

    iget v6, p0, Lcw2/c;->y:I

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Li21/n;->a(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcw2/c;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcw2/c;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcw2/c;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v3, p0, Lcw2/c;->x:J

    iget v6, p0, Lcw2/c;->y:I

    iget v7, p0, Lcw2/c;->z:I

    invoke-static/range {v1 .. v9}, Lcw2/d;->e(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
