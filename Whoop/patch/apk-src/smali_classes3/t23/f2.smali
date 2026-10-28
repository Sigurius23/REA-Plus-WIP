.class public final Lt23/f2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public synthetic w:Lc43/w;

.field public synthetic x:Z

.field public synthetic y:Z

.field public final synthetic z:Lt23/g2;


# direct methods
.method public constructor <init>(Lt23/g2;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/f2;->z:Lt23/g2;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lc43/w;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Lq83/d;

    new-instance v0, Lt23/f2;

    iget-object v1, p0, Lt23/f2;->z:Lt23/g2;

    invoke-direct {v0, v1, p4}, Lt23/f2;-><init>(Lt23/g2;Lq83/d;)V

    iput-object p1, v0, Lt23/f2;->w:Lc43/w;

    iput-boolean p2, v0, Lt23/f2;->x:Z

    iput-boolean p3, v0, Lt23/f2;->y:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/f2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/f2;->w:Lc43/w;

    iget-boolean v0, p0, Lt23/f2;->x:Z

    iget-boolean v1, p0, Lt23/f2;->y:Z

    new-instance v2, Lt23/d2;

    iget-object v3, p0, Lt23/f2;->z:Lt23/g2;

    iget-object v3, v3, Lt23/g2;->a:Ljava/lang/String;

    invoke-direct {v2, v3, p1, v0, v1}, Lt23/d2;-><init>(Ljava/lang/String;Lc43/w;ZZ)V

    return-object v2
.end method
