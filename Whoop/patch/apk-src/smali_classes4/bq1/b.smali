.class public final synthetic Lbq1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lad3/c;

.field public final synthetic y:Ljb1/a;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lad3/c;Ljb1/a;Lc93/a;I)V
    .locals 0

    iput p4, p0, Lbq1/b;->w:I

    iput-object p1, p0, Lbq1/b;->x:Lad3/c;

    iput-object p2, p0, Lbq1/b;->y:Ljb1/a;

    iput-object p3, p0, Lbq1/b;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbq1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbq1/b;->z:Lc93/a;

    check-cast p1, Llb1/z0;

    iget-object v1, p0, Lbq1/b;->x:Lad3/c;

    iget-object v2, p0, Lbq1/b;->y:Ljb1/a;

    invoke-static {v1, v2, v0, p1}, Lbq1/c;->a(Lad3/c;Ljb1/a;Lc93/a;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbq1/b;->z:Lc93/a;

    check-cast p1, Ljb1/b;

    iget-object v1, p0, Lbq1/b;->x:Lad3/c;

    iget-object v2, p0, Lbq1/b;->y:Ljb1/a;

    invoke-static {v1, v2, v0, p1}, Lbq1/c;->c(Lad3/c;Ljb1/a;Lc93/a;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
