.class public final Ljb3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu93/i;Lkb3/n;Lr93/v0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ljb3/o;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb3/o;->z:Ljava/lang/Object;

    iput-object p2, p0, Ljb3/o;->x:Ljava/lang/Object;

    iput-object p3, p0, Ljb3/o;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwa3/x;Ljava/io/ByteArrayInputStream;Ljb3/q;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ljb3/o;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb3/o;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljb3/o;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljb3/o;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ljb3/o;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lu93/h;

    iget-object v1, p0, Ljb3/o;->z:Ljava/lang/Object;

    check-cast v1, Lu93/i;

    iget-object v2, p0, Ljb3/o;->x:Ljava/lang/Object;

    check-cast v2, Lkb3/n;

    iget-object v3, p0, Ljb3/o;->y:Ljava/lang/Object;

    check-cast v3, Lr93/v0;

    invoke-direct {v0, v1, v2, v3}, Lu93/h;-><init>(Lu93/i;Lkb3/n;Lr93/v0;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljb3/o;->x:Ljava/lang/Object;

    check-cast v0, Lwa3/x;

    iget-object v1, p0, Ljb3/o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, Ljb3/o;->z:Ljava/lang/Object;

    check-cast v2, Ljb3/q;

    iget-object v2, v2, Ljb3/q;->b:Lhb3/k;

    iget-object v2, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->p:Lwa3/i;

    check-cast v0, Lwa3/c;

    invoke-virtual {v0, v1, v2}, Lwa3/c;->c(Ljava/io/ByteArrayInputStream;Lwa3/i;)Lwa3/v;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
