.class public final Ld30/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le30/c;


# direct methods
.method public synthetic constructor <init>(Le30/c;I)V
    .locals 0

    iput p2, p0, Ld30/s;->w:I

    iput-object p1, p0, Ld30/s;->x:Le30/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Ld30/s;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Ld30/s;->x:Le30/c;

    iget-object p2, p2, Le30/c;->W:Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lr20/s;

    iget-object p1, p0, Ld30/s;->x:Le30/c;

    invoke-virtual {p1}, Le30/c;->g()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lzy/c;

    iget-object p2, p0, Ld30/s;->x:Le30/c;

    iget-object p2, p2, Le30/c;->T:Lh20/z;

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Lh20/z;->a(Lzy/c;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
