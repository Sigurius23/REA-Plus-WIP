.class public final Lhe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/a;


# static fields
.field public static final a:Lhe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhe/c;->a:Lhe/c;

    return-void
.end method

.method public static o(Lrg/h;Lwf/a;)V
    .locals 2

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lwf/a;->b:Lmf/h;

    const-string v0, "x-amz-request-id"

    invoke-interface {p1, v0}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "aws.request_id"

    invoke-static {p0, v1, v0}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    const-string v0, "x-amz-id-2"

    invoke-interface {p1, v0}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string v0, "aws.extended_request_id"

    invoke-static {p0, v0, p1}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final e(Lsf/b;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lhe/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhe/b;

    iget v1, v0, Lhe/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhe/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhe/b;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lhe/b;-><init>(Lhe/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lhe/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhe/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Lsf/b;->d:Lwf/a;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lrg/a;->m(Lq83/j;)Lrg/h;

    move-result-object v2

    invoke-static {v2, p2}, Lhe/c;->o(Lrg/h;Lwf/a;)V

    iput v3, v0, Lhe/b;->y:I

    iget-object p1, p1, Lsf/b;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final g(Lsf/a;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lhe/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhe/a;

    iget v1, v0, Lhe/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhe/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhe/a;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lhe/a;-><init>(Lhe/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lhe/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhe/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Lsf/a;->d:Lwf/a;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lrg/a;->m(Lq83/j;)Lrg/h;

    move-result-object v2

    invoke-static {v2, p2}, Lhe/c;->o(Lrg/h;Lwf/a;)V

    iput v3, v0, Lhe/a;->y:I

    iget-object p1, p1, Lsf/a;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
