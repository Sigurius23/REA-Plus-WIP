.class public final synthetic Le81/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le81/h;->w:I

    iput-object p4, p0, Le81/h;->y:Ljava/lang/Object;

    iput-object p5, p0, Le81/h;->z:Ljava/lang/Object;

    iput-object p6, p0, Le81/h;->E:Ljava/lang/Object;

    iput-wide p2, p0, Le81/h;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li21/l$a;Lcom/whoop/design/util/TextResource;JLy11/r;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Le81/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Le81/h;->z:Ljava/lang/Object;

    iput-wide p3, p0, Le81/h;->x:J

    iput-object p5, p0, Le81/h;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Le81/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le81/h;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqt2/d;

    iget-object v0, p0, Le81/h;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Le81/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v4, p0, Le81/h;->x:J

    invoke-static/range {v1 .. v7}, Lqt2/f;->e(Lqt2/d;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le81/h;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li21/l$a;

    iget-object v0, p0, Le81/h;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Le81/h;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly11/r;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v3, p0, Le81/h;->x:J

    invoke-static/range {v1 .. v7}, Li21/c;->b(Li21/l$a;Lcom/whoop/design/util/TextResource;JLy11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Le81/h;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Le81/a;

    iget-object v0, p0, Le81/h;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Le81/l;

    iget-object v0, p0, Le81/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Le81/m;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v4, p0, Le81/h;->x:J

    invoke-static/range {v1 .. v7}, Le81/k;->r(Le81/a;Le81/l;Le81/m;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
