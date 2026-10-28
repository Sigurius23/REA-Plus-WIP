.class public final Lij0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxs0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lij0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lij0/a;",
        "Lxs0/b;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "applicationScope",
        "<init>",
        "(Lci2/b;Lbc3/c0;)V",
        "Lec3/l;",
        "Lxs0/a;",
        "d",
        "()Lec3/l;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lci2/b;",
        "b",
        "Lec3/l;",
        "batteryPackEventFlow",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lci2/b;

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci2/b;Lbc3/c0;)V
    .locals 2

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij0/a;->a:Lci2/b;

    invoke-direct {p0}, Lij0/a;->d()Lec3/l;

    move-result-object p1

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p2, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lij0/a;->b:Lec3/l;

    return-void
.end method

.method public static synthetic b(Lxs0/a;)Z
    .locals 0

    invoke-static {p0}, Lij0/a;->f(Lxs0/a;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lij0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lij0/a;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lij0/a;->a:Lci2/b;

    invoke-interface {v0}, Lci2/b;->b()Lec3/t1;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    new-instance v1, Lij0/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Lij0/a$b;-><init>(Lq83/d;Lij0/a;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lij0/a$d;

    invoke-direct {v1, p0, v2}, Lij0/a$d;-><init>(Lij0/a;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object v2
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lxs0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lij0/a$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lij0/a$f;

    iget v1, v0, Lij0/a$f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lij0/a$f;->z:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lij0/a$f;

    invoke-direct {v0, p0, p1}, Lij0/a$f;-><init>(Lij0/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v5, Lij0/a$f;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lij0/a$f;->z:I

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v10, :cond_1

    iget-object v0, v5, Lij0/a$f;->w:Ljava/lang/Object;

    check-cast v0, Ljk0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lij0/a;->a:Lci2/b;

    invoke-static {p1}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljk0/d;

    if-nez v1, :cond_3

    new-instance p1, Lxs0/a;

    invoke-direct {p1, v8, v11, v9, v11}, Lxs0/a;-><init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    invoke-interface {v1}, Ljk0/d;->n()Lkk0/b;

    move-result-object p1

    invoke-virtual {p1}, Lkk0/b;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, Ljk0/d;->w0()Lst0/v;

    move-result-object p1

    sget-object v2, Lij0/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v2, Lxj0/k;

    invoke-direct {v2}, Lxj0/k;-><init>()V

    iput-object v11, v5, Lij0/a$f;->w:Ljava/lang/Object;

    iput v10, v5, Lij0/a$f;->z:I

    const-wide/16 v3, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Ljk0/d;->y(Ljk0/d;Lxj0/k;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lzj0/o;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lxs0/a;

    invoke-virtual {p1}, Lzj0/o;->Z()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object p1

    invoke-direct {v0, v10, p1}, Lxs0/a;-><init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V

    return-object v0

    :pswitch_1
    new-instance p1, Lxs0/a;

    invoke-direct {p1, v10, v11, v9, v11}, Lxs0/a;-><init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    :pswitch_2
    new-instance p1, Lxs0/a;

    invoke-direct {p1, v8, v11, v9, v11}, Lxs0/a;-><init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private static final f(Lxs0/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxs0/a;->b()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lij0/a;->b:Lec3/l;

    new-instance v1, Lih0/t;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    sget-object v2, Lec3/v;->b:Lds2/a;

    invoke-static {v0, v1, v2}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object v0

    new-instance v1, Lij0/a$g;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lij0/a$g;-><init>(Lec3/l;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, v1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0
.end method
