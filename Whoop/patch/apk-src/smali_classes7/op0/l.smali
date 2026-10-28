.class public final synthetic Lop0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lop0/c;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lop0/c;II)V
    .locals 0

    iput p4, p0, Lop0/l;->w:I

    iput-object p1, p0, Lop0/l;->x:Lc93/m;

    iput-object p2, p0, Lop0/l;->y:Lop0/c;

    iput p3, p0, Lop0/l;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lop0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lop0/l;->z:I

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lop0/l;->x:Lc93/m;

    iget-object v2, p0, Lop0/l;->y:Lop0/c;

    invoke-static {v1, v2, v0, p1}, Lop0/m;->a(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lop0/l;->z:I

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lop0/l;->x:Lc93/m;

    iget-object v2, p0, Lop0/l;->y:Lop0/c;

    invoke-static {v1, v2, v0, p1}, Lop0/m;->c(Lc93/m;Lop0/c;ILandroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
