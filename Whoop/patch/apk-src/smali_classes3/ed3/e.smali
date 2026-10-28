.class public Led3/e;
.super Led3/n;
.source "SourceFile"


# instance fields
.field public final synthetic g:I

.field public final h:J

.field public final i:Le10/k0;

.field public final j:Led3/b;


# direct methods
.method public constructor <init>(JLdd3/a;Le10/k0;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Led3/e;->g:I

    .line 1
    new-instance v0, Led3/b;

    invoke-direct {v0}, Led3/b;-><init>()V

    .line 2
    const-string v1, "proto"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "parentWriter"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "descriptor"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, Le10/k0;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p3, v1, p5}, Led3/n;-><init>(Ldd3/a;Le10/k0;Lyc3/g;)V

    .line 4
    iput-wide p1, p0, Led3/e;->h:J

    .line 5
    iput-object p4, p0, Led3/e;->i:Le10/k0;

    .line 6
    iput-object v0, p0, Led3/e;->j:Led3/b;

    return-void
.end method

.method public constructor <init>(Ldd3/a;Le10/k0;JLyc3/g;Led3/b;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Led3/e;->g:I

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Le10/k0;

    const/4 v1, 0x3

    invoke-direct {v0, p6, v1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1, v0, p5}, Led3/n;-><init>(Ldd3/a;Le10/k0;Lyc3/g;)V

    .line 8
    iput-object p2, p0, Led3/e;->i:Le10/k0;

    .line 9
    iput-wide p3, p0, Led3/e;->h:J

    .line 10
    iput-object p6, p0, Led3/e;->j:Led3/b;

    return-void
.end method


# virtual methods
.method public P(Lyc3/g;)V
    .locals 6

    iget v0, p0, Led3/e;->g:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x4c2c

    iget-wide v2, p0, Led3/e;->h:J

    cmp-long p1, v2, v0

    iget-object v0, p0, Led3/e;->j:Led3/b;

    iget-object v1, p0, Led3/e;->i:Le10/k0;

    if-eqz p1, :cond_0

    const-wide/32 v4, 0x7fffffff

    and-long/2addr v2, v4

    long-to-int p1, v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "output"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v2, Led3/b;

    sget-object v3, Led3/l;->G:Led3/l;

    invoke-virtual {v3, p1}, Led3/l;->a(I)I

    move-result p1

    invoke-static {v1, v2, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {v1, v0}, Le10/k0;->R(Led3/b;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Le10/k0;->R(Led3/b;)V

    :goto_0
    return-void

    :pswitch_0
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Led3/e;->h:J

    const-wide/32 v2, 0x7fffffff

    and-long/2addr v0, v2

    long-to-int p1, v0

    iget-object v0, p0, Led3/e;->i:Le10/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "output"

    iget-object v2, p0, Led3/e;->j:Led3/b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Led3/b;

    sget-object v3, Led3/l;->G:Led3/l;

    invoke-virtual {v3, p1}, Led3/l;->a(I)I

    move-result p1

    invoke-static {v0, v1, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {v0, v2}, Le10/k0;->R(Led3/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public Q(Lyc3/g;I)J
    .locals 1

    iget v0, p0, Led3/e;->g:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    return-wide p1

    :pswitch_0
    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ldd3/b;->x:Ldd3/b;

    const/4 p1, 0x1

    int-to-long p1, p1

    return-wide p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
