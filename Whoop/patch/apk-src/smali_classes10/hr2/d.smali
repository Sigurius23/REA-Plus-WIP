.class public final synthetic Lhr2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JII)V
    .locals 0

    iput p5, p0, Lhr2/d;->w:I

    iput-object p1, p0, Lhr2/d;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lhr2/d;->x:J

    iput p4, p0, Lhr2/d;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lhr2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhr2/d;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v2, p0, Lhr2/d;->x:J

    iget v4, p0, Lhr2/d;->y:I

    invoke-static/range {v1 .. v6}, Lsq2/a;->a(Ljava/util/List;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhr2/d;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhr2/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v2, p0, Lhr2/d;->x:J

    iget v4, p0, Lhr2/d;->y:I

    invoke-static/range {v1 .. v6}, Lhr2/e;->c(Lhr2/a;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
