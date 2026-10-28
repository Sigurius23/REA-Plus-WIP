.class public final synthetic Lk03/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;JI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lk03/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk03/i;->x:I

    iput-object p2, p0, Lk03/i;->y:Ljava/lang/String;

    iput-object p3, p0, Lk03/i;->F:Ljava/lang/Object;

    iput-wide p4, p0, Lk03/i;->z:J

    iput p6, p0, Lk03/i;->E:I

    return-void
.end method

.method public synthetic constructor <init>(ILn6/o;Ljava/lang/String;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lk03/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk03/i;->x:I

    iput-object p2, p0, Lk03/i;->F:Ljava/lang/Object;

    iput-object p3, p0, Lk03/i;->y:Ljava/lang/String;

    iput-wide p4, p0, Lk03/i;->z:J

    iput p6, p0, Lk03/i;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lk03/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk03/i;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Lv6/s;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lk03/i;->x:I

    iget-object v2, p0, Lk03/i;->y:Ljava/lang/String;

    iget-wide v4, p0, Lk03/i;->z:J

    iget v6, p0, Lk03/i;->E:I

    invoke-static/range {v1 .. v9}, Lk03/n;->b(ILjava/lang/String;Ljava/lang/String;JILv6/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lk03/i;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln6/o;

    move-object v7, p1

    check-cast v7, Lv6/s;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lk03/i;->x:I

    iget-object v3, p0, Lk03/i;->y:Ljava/lang/String;

    iget-wide v4, p0, Lk03/i;->z:J

    iget v6, p0, Lk03/i;->E:I

    invoke-static/range {v1 .. v9}, Lk03/n;->o(ILn6/o;Ljava/lang/String;JILv6/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
