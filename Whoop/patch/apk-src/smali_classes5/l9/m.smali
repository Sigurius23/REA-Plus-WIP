.class public final synthetic Ll9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lz8/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lz8/e;I)V
    .locals 0

    iput p3, p0, Ll9/m;->w:I

    iput-object p1, p0, Ll9/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Ll9/m;->y:Lz8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll9/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll9/m;->x:Ljava/lang/Object;

    check-cast v0, Ll9/o;

    new-instance v1, Ll9/u0;

    iget-object v0, v0, Ll9/o;->b:Ljava/lang/Object;

    check-cast v0, Lt9/l;

    iget-object v2, p0, Ll9/m;->y:Lz8/e;

    invoke-direct {v1, v2, v0}, Ll9/u0;-><init>(Lz8/e;Lt9/l;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Ll9/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    iget-object v1, p0, Ll9/m;->y:Lz8/e;

    invoke-static {v0, v1}, Ll9/p;->e(Ljava/lang/Class;Lz8/e;)Ll9/b0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll9/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    iget-object v1, p0, Ll9/m;->y:Lz8/e;

    invoke-static {v0, v1}, Ll9/p;->e(Ljava/lang/Class;Lz8/e;)Ll9/b0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ll9/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    iget-object v1, p0, Ll9/m;->y:Lz8/e;

    invoke-static {v0, v1}, Ll9/p;->e(Ljava/lang/Class;Lz8/e;)Ll9/b0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
