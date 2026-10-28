.class public final synthetic Lio2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(IJZ)V
    .locals 0

    iput p1, p0, Lio2/f;->w:I

    iput-boolean p4, p0, Lio2/f;->x:Z

    iput-wide p2, p0, Lio2/f;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lio2/f;->y:J

    check-cast p1, Ltb/a;

    iget-boolean v2, p0, Lio2/f;->x:Z

    invoke-static {v2, v0, v1, p1}, Lus1/b;->k(ZJLtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v0, p0, Lio2/f;->y:J

    check-cast p1, Lk2/e;

    iget-boolean v2, p0, Lio2/f;->x:Z

    invoke-static {v2, v0, v1, p1}, Lio2/g;->c(ZJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
