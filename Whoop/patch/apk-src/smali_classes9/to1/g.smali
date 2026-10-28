.class public final synthetic Lto1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic w:I

.field public final synthetic x:Lad3/c;

.field public final synthetic y:Loo1/h$a;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lad3/c;Loo1/h$a;ZZI)V
    .locals 0

    iput p5, p0, Lto1/g;->w:I

    iput-object p1, p0, Lto1/g;->x:Lad3/c;

    iput-object p2, p0, Lto1/g;->y:Loo1/h$a;

    iput-boolean p3, p0, Lto1/g;->z:Z

    iput-boolean p4, p0, Lto1/g;->E:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lto1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lto1/g;->E:Z

    check-cast p1, Llb1/z0;

    iget-object v1, p0, Lto1/g;->x:Lad3/c;

    iget-object v2, p0, Lto1/g;->y:Loo1/h$a;

    iget-boolean v3, p0, Lto1/g;->z:Z

    invoke-static {v1, v2, v3, v0, p1}, Lto1/l;->p(Lad3/c;Loo1/h$a;ZZLlb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Lto1/g;->E:Z

    check-cast p1, Ljb1/b;

    iget-object v1, p0, Lto1/g;->x:Lad3/c;

    iget-object v2, p0, Lto1/g;->y:Loo1/h$a;

    iget-boolean v3, p0, Lto1/g;->z:Z

    invoke-static {v1, v2, v3, v0, p1}, Lto1/l;->s(Lad3/c;Loo1/h$a;ZZLjb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
