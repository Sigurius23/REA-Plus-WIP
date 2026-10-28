.class public final synthetic Lk03/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lk03/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk03/l;->x:I

    iput-object p2, p0, Lk03/l;->y:Ljava/lang/String;

    iput-wide p3, p0, Lk03/l;->z:J

    iput-object p5, p0, Lk03/l;->E:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lk03/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk03/l;->z:J

    iput p3, p0, Lk03/l;->x:I

    iput-object p4, p0, Lk03/l;->y:Ljava/lang/String;

    iput-object p5, p0, Lk03/l;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lk03/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Lv6/g;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Lk03/l;->x:I

    iget-object v2, p0, Lk03/l;->y:Ljava/lang/String;

    iget-wide v3, p0, Lk03/l;->z:J

    iget-object v5, p0, Lk03/l;->E:Ljava/lang/String;

    invoke-static/range {v1 .. v8}, Lk03/n;->k(ILjava/lang/String;JLjava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Lv6/g;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Lk03/l;->x:I

    iget-object v1, p0, Lk03/l;->y:Ljava/lang/String;

    iget-wide v2, p0, Lk03/l;->z:J

    iget-object v4, p0, Lk03/l;->E:Ljava/lang/String;

    invoke-static/range {v0 .. v7}, Lk03/n;->d(ILjava/lang/String;JLjava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
