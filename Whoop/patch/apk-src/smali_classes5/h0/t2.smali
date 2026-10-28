.class public final Lh0/t2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(JLq83/d;)V
    .locals 0

    iput-wide p1, p0, Lh0/t2;->x:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lh0/t2;

    iget-wide v1, p0, Lh0/t2;->x:J

    invoke-direct {v0, v1, v2, p2}, Lh0/t2;-><init>(JLq83/d;)V

    iput-object p1, v0, Lh0/t2;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/t2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/t2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/t2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/t2;->w:Ljava/lang/Object;

    check-cast p1, Lh0/a3;

    iget-object p1, p1, Lh0/a3;->a:Lh0/c3;

    iget-object v0, p1, Lh0/c3;->k:Lh0/k2;

    iget-wide v1, p0, Lh0/t2;->x:J

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v2, v3}, Lh0/c3;->c(Lh0/k2;JI)J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
