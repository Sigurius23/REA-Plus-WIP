.class public final synthetic Ljd2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IJ)V
    .locals 0

    iput p2, p0, Ljd2/a;->w:I

    iput-object p1, p0, Ljd2/a;->x:Ljava/util/List;

    iput-wide p3, p0, Ljd2/a;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ljd2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Ljd2/a;->y:J

    check-cast p1, Lk2/e;

    iget-object v2, p0, Ljd2/a;->x:Ljava/util/List;

    invoke-static {v2, v0, v1, p1}, Lwo1/p0;->h(Ljava/util/List;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v0, p0, Ljd2/a;->y:J

    check-cast p1, Lo0/s;

    iget-object v2, p0, Ljd2/a;->x:Ljava/util/List;

    invoke-static {v2, v0, v1, p1}, Ln21/c;->a(Ljava/util/List;JLo0/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-wide v0, p0, Ljd2/a;->y:J

    check-cast p1, Lk2/e;

    iget-object v2, p0, Ljd2/a;->x:Ljava/util/List;

    invoke-static {v2, v0, v1, p1}, Ljd2/b;->c(Ljava/util/List;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
