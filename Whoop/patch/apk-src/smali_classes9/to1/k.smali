.class public final synthetic Lto1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljb1/a;

.field public final synthetic F:Z

.field public final synthetic G:Lh91/b;

.field public final synthetic H:Ljava/lang/Integer;

.field public final synthetic I:Z

.field public final synthetic w:I

.field public final synthetic x:Lad3/c;

.field public final synthetic y:Loo1/h$a;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lad3/c;Loo1/h$a;ZLjb1/a;ZLh91/b;Ljava/lang/Integer;ZI)V
    .locals 0

    iput p9, p0, Lto1/k;->w:I

    iput-object p1, p0, Lto1/k;->x:Lad3/c;

    iput-object p2, p0, Lto1/k;->y:Loo1/h$a;

    iput-boolean p3, p0, Lto1/k;->z:Z

    iput-object p4, p0, Lto1/k;->E:Ljb1/a;

    iput-boolean p5, p0, Lto1/k;->F:Z

    iput-object p6, p0, Lto1/k;->G:Lh91/b;

    iput-object p7, p0, Lto1/k;->H:Ljava/lang/Integer;

    iput-boolean p8, p0, Lto1/k;->I:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lto1/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v8, p0, Lto1/k;->I:Z

    move-object v9, p1

    check-cast v9, Llb1/z0;

    iget-object v1, p0, Lto1/k;->x:Lad3/c;

    iget-object v2, p0, Lto1/k;->y:Loo1/h$a;

    iget-boolean v3, p0, Lto1/k;->z:Z

    iget-object v4, p0, Lto1/k;->E:Ljb1/a;

    iget-boolean v5, p0, Lto1/k;->F:Z

    iget-object v6, p0, Lto1/k;->G:Lh91/b;

    iget-object v7, p0, Lto1/k;->H:Ljava/lang/Integer;

    invoke-static/range {v1 .. v9}, Lto1/l;->b(Lad3/c;Loo1/h$a;ZLjb1/a;ZLh91/b;Ljava/lang/Integer;ZLlb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v7, p0, Lto1/k;->I:Z

    move-object v8, p1

    check-cast v8, Ljb1/b;

    iget-object v0, p0, Lto1/k;->x:Lad3/c;

    iget-object v1, p0, Lto1/k;->y:Loo1/h$a;

    iget-boolean v2, p0, Lto1/k;->z:Z

    iget-object v3, p0, Lto1/k;->E:Ljb1/a;

    iget-boolean v4, p0, Lto1/k;->F:Z

    iget-object v5, p0, Lto1/k;->G:Lh91/b;

    iget-object v6, p0, Lto1/k;->H:Ljava/lang/Integer;

    invoke-static/range {v0 .. v8}, Lto1/l;->v(Lad3/c;Loo1/h$a;ZLjb1/a;ZLh91/b;Ljava/lang/Integer;ZLjb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
