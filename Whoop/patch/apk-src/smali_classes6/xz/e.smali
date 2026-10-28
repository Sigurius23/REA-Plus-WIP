.class public final Lxz/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lxz/x;

.field public y:I


# direct methods
.method public constructor <init>(Lxz/x;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxz/e;->x:Lxz/x;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxz/e;->w:Ljava/lang/Object;

    iget p1, p0, Lxz/e;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxz/e;->y:I

    iget-object p1, p0, Lxz/e;->x:Lxz/x;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lxz/x;->e(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
