.class public final synthetic Lwr0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lc93/a;JJFI)V
    .locals 0

    iput p7, p0, Lwr0/i0;->w:I

    iput-object p1, p0, Lwr0/i0;->x:Lc93/a;

    iput-wide p2, p0, Lwr0/i0;->y:J

    iput-wide p4, p0, Lwr0/i0;->z:J

    iput p6, p0, Lwr0/i0;->E:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lwr0/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v6, p0, Lwr0/i0;->E:F

    move-object v7, p1

    check-cast v7, Lk2/c;

    iget-object v1, p0, Lwr0/i0;->x:Lc93/a;

    iget-wide v2, p0, Lwr0/i0;->y:J

    iget-wide v4, p0, Lwr0/i0;->z:J

    invoke-static/range {v1 .. v7}, Lzq0/f;->k(Lc93/a;JJFLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v5, p0, Lwr0/i0;->E:F

    move-object v6, p1

    check-cast v6, Lk2/c;

    iget-object v0, p0, Lwr0/i0;->x:Lc93/a;

    iget-wide v1, p0, Lwr0/i0;->y:J

    iget-wide v3, p0, Lwr0/i0;->z:J

    invoke-static/range {v0 .. v6}, Lwr0/j0;->e(Lc93/a;JJFLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
