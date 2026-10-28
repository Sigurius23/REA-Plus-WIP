.class public final Lg30/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lg30/g;

.field public y:I


# direct methods
.method public constructor <init>(Lg30/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg30/a;->x:Lg30/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lg30/a;->w:Ljava/lang/Object;

    iget p1, p0, Lg30/a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg30/a;->y:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lg30/a;->x:Lg30/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lg30/g;->b(Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
