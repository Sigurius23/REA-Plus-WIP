.class public final synthetic Lky0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V
    .locals 0

    .line 1
    iput p6, p0, Lky0/a;->w:I

    iput-wide p1, p0, Lky0/a;->x:J

    iput-object p3, p0, Lky0/a;->y:Ljava/lang/Object;

    iput-object p4, p0, Lky0/a;->z:Ljava/lang/Object;

    iput p5, p0, Lky0/a;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JII)V
    .locals 0

    .line 2
    iput p6, p0, Lky0/a;->w:I

    iput-object p1, p0, Lky0/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lky0/a;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lky0/a;->x:J

    iput p5, p0, Lky0/a;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lky0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lky0/a;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/s1;

    iget-object v0, p0, Lky0/a;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/g;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v3, p0, Lky0/a;->x:J

    iget v5, p0, Lky0/a;->E:I

    invoke-static/range {v1 .. v7}, Lhy0/i2;->c(Ll0/s1;Lhy0/g;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lky0/a;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lky0/a;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v1, p0, Lky0/a;->x:J

    iget v5, p0, Lky0/a;->E:I

    invoke-static/range {v1 .. v7}, Lky0/b;->d(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lky0/a;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lky0/a;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v1, p0, Lky0/a;->x:J

    iget v5, p0, Lky0/a;->E:I

    invoke-static/range {v1 .. v7}, Lky0/b;->c(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lky0/a;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lky0/a;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v1, p0, Lky0/a;->x:J

    iget v5, p0, Lky0/a;->E:I

    invoke-static/range {v1 .. v7}, Lky0/b;->b(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
