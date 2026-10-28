.class public final synthetic Lm03/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lm03/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm03/c;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lm03/c;->x:J

    iput-object p4, p0, Lm03/c;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lm03/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm03/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lm03/c;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lm03/c;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lm03/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm03/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lm03/c;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Lc93/m;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v2, p0, Lm03/c;->x:J

    invoke-static/range {v1 .. v7}, Lt11/e;->a(Lcom/whoop/design/util/TextResource;JLp1/c1;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm03/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lm03/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Lv6/g;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v3, p0, Lm03/c;->x:J

    invoke-static/range {v1 .. v7}, Lm03/d;->a(Ljava/lang/String;Ljava/lang/String;JLv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
