.class public final synthetic Lf71/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lf71/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf71/b;->x:F

    iput p2, p0, Lf71/b;->y:F

    iput p3, p0, Lf71/b;->z:F

    iput-wide p4, p0, Lf71/b;->E:J

    return-void
.end method

.method public synthetic constructor <init>(FFJF)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lf71/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf71/b;->x:F

    iput p2, p0, Lf71/b;->y:F

    iput-wide p3, p0, Lf71/b;->E:J

    iput p5, p0, Lf71/b;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf71/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v4, p0, Lf71/b;->E:J

    move-object v6, p1

    check-cast v6, Lk2/c;

    iget v1, p0, Lf71/b;->x:F

    iget v2, p0, Lf71/b;->y:F

    iget v3, p0, Lf71/b;->z:F

    invoke-static/range {v1 .. v6}, Lh02/h0;->a(FFFJLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v4, p0, Lf71/b;->z:F

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget v0, p0, Lf71/b;->x:F

    iget v1, p0, Lf71/b;->y:F

    iget-wide v2, p0, Lf71/b;->E:J

    invoke-static/range {v0 .. v5}, Lf71/d;->b(FFJFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
