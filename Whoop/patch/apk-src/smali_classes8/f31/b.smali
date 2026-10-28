.class public final synthetic Lf31/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc93/o;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Lc93/o;II)V
    .locals 0

    iput p5, p0, Lf31/b;->w:I

    iput-object p1, p0, Lf31/b;->x:Ljava/util/List;

    iput-object p2, p0, Lf31/b;->y:Ljava/lang/Object;

    iput-object p3, p0, Lf31/b;->z:Lc93/o;

    iput p4, p0, Lf31/b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf31/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lf31/b;->E:I

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lf31/b;->x:Ljava/util/List;

    iget-object v2, p0, Lf31/b;->y:Ljava/lang/Object;

    iget-object v3, p0, Lf31/b;->z:Lc93/o;

    invoke-static {v1, v2, v3, v0, p1}, Lf31/c;->c(Ljava/util/List;Ljava/lang/Object;Lc93/o;ILn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lf31/b;->E:I

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lf31/b;->x:Ljava/util/List;

    iget-object v2, p0, Lf31/b;->y:Ljava/lang/Object;

    iget-object v3, p0, Lf31/b;->z:Lc93/o;

    invoke-static {v1, v2, v3, v0, p1}, Lf31/c;->d(Ljava/util/List;Ljava/lang/Object;Lc93/o;ILn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
