.class public final synthetic Lih0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq3/y;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lq3/y;Ljava/lang/String;JI)V
    .locals 0

    iput p5, p0, Lih0/i;->w:I

    iput-object p1, p0, Lih0/i;->x:Lq3/y;

    iput-object p2, p0, Lih0/i;->y:Ljava/lang/String;

    iput-wide p3, p0, Lih0/i;->z:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lih0/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Lc93/m;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lih0/i;->x:Lq3/y;

    iget-object v2, p0, Lih0/i;->y:Ljava/lang/String;

    iget-wide v3, p0, Lih0/i;->z:J

    invoke-static/range {v1 .. v7}, Lih0/l;->m(Lq3/y;Ljava/lang/String;JLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Lc93/m;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lih0/i;->x:Lq3/y;

    iget-object v1, p0, Lih0/i;->y:Ljava/lang/String;

    iget-wide v2, p0, Lih0/i;->z:J

    invoke-static/range {v0 .. v6}, Lih0/l;->s(Lq3/y;Ljava/lang/String;JLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
