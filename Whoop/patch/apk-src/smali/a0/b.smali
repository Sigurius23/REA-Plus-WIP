.class public final La0/b;
.super La0/m;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(La0/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La0/b;->z:I

    .line 4
    iput-object p1, p0, La0/b;->E:Ljava/lang/Object;

    .line 5
    iget p1, p1, La0/f1;->y:I

    .line 6
    invoke-direct {p0, p1}, La0/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(La0/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/b;->z:I

    .line 1
    iput-object p1, p0, La0/b;->E:Ljava/lang/Object;

    .line 2
    iget p1, p1, La0/h;->y:I

    .line 3
    invoke-direct {p0, p1}, La0/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La0/b;->z:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/b;->E:Ljava/lang/Object;

    check-cast v0, La0/h;

    iget-object v0, v0, La0/h;->x:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La0/b;->E:Ljava/lang/Object;

    check-cast v0, La0/g;

    invoke-virtual {v0, p1}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)V
    .locals 1

    iget v0, p0, La0/b;->z:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/b;->E:Ljava/lang/Object;

    check-cast v0, La0/h;

    invoke-virtual {v0, p1}, La0/h;->a(I)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, La0/b;->E:Ljava/lang/Object;

    check-cast v0, La0/g;

    invoke-virtual {v0, p1}, La0/f1;->i(I)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
