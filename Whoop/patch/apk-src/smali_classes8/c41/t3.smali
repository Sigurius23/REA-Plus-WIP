.class public final synthetic Lc41/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JJLgz0/m0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lc41/t3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/t3;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lc41/t3;->y:J

    iput-wide p4, p0, Lc41/t3;->z:J

    iput-object p6, p0, Lc41/t3;->F:Ljava/lang/Object;

    iput p7, p0, Lc41/t3;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc41/t3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/t3;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lc41/t3;->y:J

    iput-object p4, p0, Lc41/t3;->F:Ljava/lang/Object;

    iput-wide p5, p0, Lc41/t3;->z:J

    iput p7, p0, Lc41/t3;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IJJ)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lc41/t3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lc41/t3;->x:I

    iput-wide p4, p0, Lc41/t3;->y:J

    iput-wide p6, p0, Lc41/t3;->z:J

    iput-object p1, p0, Lc41/t3;->E:Ljava/lang/Object;

    iput-object p2, p0, Lc41/t3;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lc41/t3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/t3;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc41/t3;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lgz0/m0;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Lc41/t3;->y:J

    iget-wide v4, p0, Lc41/t3;->z:J

    iget v7, p0, Lc41/t3;->x:I

    invoke-static/range {v1 .. v9}, Lox2/i;->b(Lcom/whoop/design/util/TextResource;JJLgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/t3;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lc41/t3;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lc41/t3;->x:I

    iget-wide v2, p0, Lc41/t3;->y:J

    iget-wide v4, p0, Lc41/t3;->z:J

    invoke-static/range {v1 .. v9}, Lox2/b;->a(IJJLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc41/t3;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc41/t3;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Lc41/t3;->y:J

    iget-wide v5, p0, Lc41/t3;->z:J

    iget v7, p0, Lc41/t3;->x:I

    invoke-static/range {v1 .. v9}, Lc41/u3;->c(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
