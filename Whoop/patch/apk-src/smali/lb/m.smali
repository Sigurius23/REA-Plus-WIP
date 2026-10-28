.class public final Llb/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Llb/n;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Llb/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Llb/m;->w:Llb/n;

    iput-object p2, p0, Llb/m;->x:Ljava/lang/String;

    iput-object p3, p0, Llb/m;->y:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Llb/m;

    iget-object v1, p0, Llb/m;->x:Ljava/lang/String;

    iget-object v2, p0, Llb/m;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Llb/m;->w:Llb/n;

    invoke-direct {v0, v3, v1, v2, p1}, Llb/m;-><init>(Llb/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llb/m;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llb/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llb/m;->w:Llb/n;

    iget-object p1, p1, Llb/n;->b:Ltb/a;

    iget-object v0, p0, Llb/m;->x:Ljava/lang/String;

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    iget-object v0, p0, Llb/m;->y:Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method
