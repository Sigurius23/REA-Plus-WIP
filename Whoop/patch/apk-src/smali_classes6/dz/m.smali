.class public final Ldz/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:La30/c;

.field public final y:Lb20/g;


# direct methods
.method public constructor <init>(La30/c;Lb20/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldz/m;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldz/m;->x:La30/c;

    .line 3
    iput-object p2, p0, Ldz/m;->y:Lb20/g;

    return-void
.end method

.method public constructor <init>(Lb20/g;La30/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldz/m;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Ldz/m;->y:Lb20/g;

    .line 6
    iput-object p2, p0, Ldz/m;->x:La30/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ldz/m;->w:I

    iget-object v1, p0, Ldz/m;->y:Lb20/g;

    iget-object v2, p0, Ldz/m;->x:La30/c;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v2}, La30/c;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy/c;

    invoke-virtual {v1}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy/j;

    new-instance v2, Lb20/f;

    invoke-direct {v2, v1, v0}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    return-object v2

    :pswitch_0
    invoke-virtual {v1}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy/j;

    invoke-virtual {v2}, La30/c;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy/c;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    invoke-static {v2}, Ls93/k;->c(Ljava/lang/Object;)V

    new-instance v3, La33/d;

    invoke-direct {v3, v0, v1, v2}, La33/d;-><init>(Lyy/j;Lyy/c;Lq83/j;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
