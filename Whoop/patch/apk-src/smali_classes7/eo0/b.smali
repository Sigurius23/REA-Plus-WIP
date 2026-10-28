.class public final synthetic Leo0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JIIIJ)V
    .locals 0

    iput p5, p0, Leo0/b;->w:I

    iput p3, p0, Leo0/b;->x:I

    iput-wide p1, p0, Leo0/b;->y:J

    iput-wide p6, p0, Leo0/b;->z:J

    iput p4, p0, Leo0/b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Leo0/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Leo0/b;->x:I

    iget-wide v2, p0, Leo0/b;->y:J

    iget-wide v4, p0, Leo0/b;->z:J

    iget v6, p0, Leo0/b;->E:I

    invoke-static/range {v1 .. v8}, Lhy0/w1;->a(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Leo0/b;->x:I

    iget-wide v1, p0, Leo0/b;->y:J

    iget-wide v3, p0, Leo0/b;->z:J

    iget v5, p0, Leo0/b;->E:I

    invoke-static/range {v0 .. v7}, Leo0/c;->a(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
